package org.joy.game;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
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
    //这个地方增加集合操作
    static private final ChannelGroup _channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    /**
     * 用户字典
     */
    static private final Map<Integer, User> _userMap = new HashMap<>();

    //连接操作
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        if (null == ctx) {
            return;
        }
        try {
            super.channelActive(ctx);
            //添加子对象
            _channelGroup.add(ctx.channel());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
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
                //
                // 用户入场消息
                //
                GameMsgProtocol.UserEntryCmd cmd = (GameMsgProtocol.UserEntryCmd) msg;
                int userId = cmd.getUserId();
                String heroAvatar = cmd.getHeroAvatar();

                User newUser = new User();
                newUser.userId = userId;
                newUser.heroAvatar = heroAvatar;
                _userMap.putIfAbsent(userId, newUser);

                GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();
                resultBuilder.setUserId(userId);
                resultBuilder.setHeroAvatar(heroAvatar);

                // 构建结果并广播
                GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
                _channelGroup.writeAndFlush(newResult);
            } else if (msg instanceof GameMsgProtocol.WhoElseIsHereCmd) {
                //
                // 还有谁在场
                //
                GameMsgProtocol.WhoElseIsHereResult.Builder resultBuilder = GameMsgProtocol.WhoElseIsHereResult.newBuilder();

                for (User currUser : _userMap.values()) {
                    if (null == currUser) {
                        continue;
                    }

                    GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder userInfoBuilder = GameMsgProtocol.WhoElseIsHereResult.UserInfo.newBuilder();
                    userInfoBuilder.setUserId(currUser.userId);
                    userInfoBuilder.setHeroAvatar(currUser.heroAvatar);
                    resultBuilder.addUserInfo(userInfoBuilder);
                }

                GameMsgProtocol.WhoElseIsHereResult newResult = resultBuilder.build();
                ctx.writeAndFlush(newResult);
            }
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}
