package org.joy.game;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.cmdHandler.UserEntryCmdHandler;
import org.cmdHandler.WhoElseIsHereCmdHandler;
import org.model.UserManager;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

import java.util.HashMap;
import java.util.Map;

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
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
        super.channelWritabilityChanged(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
//        System.out.println("服务器收到客户端消息 msg=" + o);
        if (null == ctx || null == msg) {
            LOGGER.info("channelRead0数据或则消息体出错");
            return;
        }
        try {
            if (msg instanceof GameMsgProtocol.UserEntryCmd) {
                new UserEntryCmdHandler().handle(ctx, (GameMsgProtocol.UserEntryCmd) msg);
            } else if (msg instanceof GameMsgProtocol.WhoElseIsHereCmd) {
                new WhoElseIsHereCmdHandler().handle(ctx,(GameMsgProtocol.WhoElseIsHereCmd)msg);
            }
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}
