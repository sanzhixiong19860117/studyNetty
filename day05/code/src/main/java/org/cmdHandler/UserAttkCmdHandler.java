package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import org.joy.game.Broadcaster;
import org.model.User;
import org.model.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/9 17:46
 */
public class UserAttkCmdHandler implements ICmdHandler<GameMsgProtocol.UserAttkCmd> {
    private static Logger LOGGER = LoggerFactory.getLogger(UserAttkCmdHandler.class);

    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.UserAttkCmd cmd) {
        if (null == ctx || null == cmd) {
            return;
        }
        //获取攻击者id
        Integer attkUserId = (Integer) ctx.channel().attr(AttributeKey.valueOf("userId")).get();
        if (null == attkUserId) {
            LOGGER.info("攻击者没有");
            return;
        }

        //攻击者
        int targetUserId = cmd.getTargetUserId();

        GameMsgProtocol.UserAttkResult.Builder result = GameMsgProtocol.UserAttkResult.newBuilder();
        result.setAttkUserId(attkUserId);
        result.setTargetUserId(targetUserId);

        GameMsgProtocol.UserAttkResult newResult = result.build();
        Broadcaster.sendAllMsg(newResult);

        //受到攻击者
        User targetUser = UserManager.getUserById(targetUserId);
        if (null == targetUser) {
            return;
        }

        //血量
        int subtractHp = 10;
        targetUser.currHp = targetUser.currHp - subtractHp;

        //广播减血操作
        broadcastSubtractHp(targetUserId, subtractHp);

        //如果是血量被攻击的人见血
        if (targetUser.currHp <= 0) {
            //死亡消息
            broadcastDie(targetUserId);
        }
    }


    /**
     * 死亡消息
     *
     * @param targetId 谁死亡了
     */
    static private void broadcastDie(int targetId) {
        if (targetId < 0) {
            LOGGER.error("死亡消息的id出错id={}", targetId);
            return;
        }

        //创建对象
        GameMsgProtocol.UserDieResult.Builder result = GameMsgProtocol.UserDieResult.newBuilder();
        result.setTargetUserId(targetId);

        //装入到对应的数据里面
        GameMsgProtocol.UserDieResult newResult = result.build();
        Broadcaster.sendAllMsg(newResult);
    }

    /**
     * 见血的消息
     *
     * @param targetUserId 受攻击者的id
     * @param subtractHp   攻击的血量
     */
    static private void broadcastSubtractHp(int targetUserId, int subtractHp) {
        if (targetUserId < 0 || subtractHp < 0) {
            return;
        }

        //创建返回对象
        GameMsgProtocol.UserSubtractHpResult.Builder result = GameMsgProtocol.UserSubtractHpResult.newBuilder();
        result.setTargetUserId(targetUserId);
        result.setSubtractHp(subtractHp);

        GameMsgProtocol.UserSubtractHpResult newResult = result.build();
        Broadcaster.sendAllMsg(newResult);
    }
}
