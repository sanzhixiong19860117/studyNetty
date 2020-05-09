package org.joy.game;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.AttributeKey;
import org.cmdHandler.CmdHandlerFactory;
import org.cmdHandler.ICmdHandler;
import org.model.UserManager;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 15:22
 */
public class GameMsgHandler extends SimpleChannelInboundHandler<Object> {
    //日志对象
    static private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GameMsgHandler.class);

    //连接操作
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        //添加子对象
        Broadcaster.addChannel(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        super.handlerRemoved(ctx);

        // 移除客户端信道
        Broadcaster.removeChannel(ctx.channel());

        // 拿到用户 Id
        Integer userId = (Integer) ctx.channel().attr(AttributeKey.valueOf("userId")).get();
        if (null == userId) {
            return;
        }

        // 移除用户
        UserManager.removeUser(userId);

        // 广播用户离场的消息
        GameMsgProtocol.UserQuitResult.Builder resultBuilder = GameMsgProtocol.UserQuitResult.newBuilder();
        resultBuilder.setQuitUserId(userId);

        GameMsgProtocol.UserQuitResult newResult = resultBuilder.build();
        Broadcaster.sendAllMsg(newResult);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        Class<?> msgClazz = msg.getClass();

        LOGGER.info(
                "收到客户端消息, msgClazz = {}, msg = {}",
                msgClazz.getName(),
                msg
        );

        ICmdHandler<? extends GeneratedMessageV3>
                cmdHandler = CmdHandlerFactory.crate(msgClazz);
        if (null != cmdHandler) {
            cmdHandler.handle(ctx, cast(msg));
        } else {
            LOGGER.info("未找到对应的指令器,msgClazz={}", msgClazz.getName());
            return;
        }
    }

    /**
     * 转换消息对象
     *
     * @param msg
     * @param <TCmd>
     * @return
     */
    static private <TCmd extends GeneratedMessageV3> TCmd cast(Object msg) {
        if (null == msg) {
            return null;
        } else {
            return (TCmd) msg;
        }
    }
}
