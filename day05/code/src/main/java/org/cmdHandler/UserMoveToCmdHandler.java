package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import org.joy.game.Broadcaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/9 15:20
 * 移动操作
 */
public final class UserMoveToCmdHandler implements ICmdHandler<GameMsgProtocol.UserMoveToCmd> {
    static private Logger LOGGER = LoggerFactory.getLogger(UserMoveToCmdHandler.class);

    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.UserMoveToCmd cmd) {
        LOGGER.info("收到移动消息");
        //第一步判断数据是否为null
        if (null == ctx
                || null == cmd) {
            LOGGER.error("传入的移动数据不正确");
            return;
        }

        //获取用户id
        Integer userId = (Integer) ctx.channel().attr(AttributeKey.valueOf("userId")).get();
        if (null == userId) {
            System.out.println("userId不存在");
            return;
        }

        //创建对象
        GameMsgProtocol.UserMoveToResult.Builder resultBuilder = GameMsgProtocol.UserMoveToResult.newBuilder();
        resultBuilder.setMoveUserId(userId);
        resultBuilder.setMoveToPosX(cmd.getMoveToPosX());
        resultBuilder.setMoveToPosY(cmd.getMoveToPosY());

        //获取对应的数据
        GameMsgProtocol.UserMoveToResult newResult = resultBuilder.build();

        //发送消息
        Broadcaster.sendAllMsg(newResult);
    }
}
