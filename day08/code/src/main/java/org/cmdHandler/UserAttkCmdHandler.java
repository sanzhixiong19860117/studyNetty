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
 * @date 2020/5/9 17:46
 */
public class UserAttkCmdHandler implements ICmdHandler<GameMsgProtocol.UserAttkCmd> {
    private static Logger LOGGER = LoggerFactory.getLogger(UserAttkCmdHandler.class);

    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.UserAttkCmd cmd) {
        if(null == ctx || null == cmd){
            return;
        }
        //获取攻击者id
        Integer attkUserId = (Integer) ctx.channel().attr(AttributeKey.valueOf("userId")).get();
        if(null == attkUserId){
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
    }
}
