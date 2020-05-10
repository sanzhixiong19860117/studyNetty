package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import org.joy.game.Broadcaster;
import org.model.MoveState;
import org.model.User;
import org.model.UserManager;

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

        //获取移动用户
        User moveUser = UserManager.getUserById(userId);

        MoveState mvState = moveUser.moveState;
        //设置
        mvState.fromPosX = cmd.getMoveFromPosX();
        mvState.fromPosY = cmd.getMoveFromPosY();
        mvState.toPosX = cmd.getMoveToPosX();
        mvState.toPosY = cmd.getMoveToPosY();
        mvState.startTime = System.currentTimeMillis();//当前时间

        //创建对象
        GameMsgProtocol.UserMoveToResult.Builder resultBuilder = GameMsgProtocol.UserMoveToResult.newBuilder();
        resultBuilder.setMoveUserId(userId);
        resultBuilder.setMoveFromPosX(mvState.fromPosX);
        resultBuilder.setMoveFromPosY(mvState.fromPosY);
        resultBuilder.setMoveToPosX(mvState.toPosX);
        resultBuilder.setMoveToPosY(mvState.toPosY);
        resultBuilder.setMoveStartTime(mvState.startTime);

        //获取对应的数据
        GameMsgProtocol.UserMoveToResult newResult = resultBuilder.build();
        //发送消息
        Broadcaster.sendAllMsg(newResult);
    }
}
