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
 * @date 2020/5/8 13:00
 * 进入场景的消息处理类
 */
public final class UserEntryCmdHandler implements ICmdHandler<GameMsgProtocol.UserEntryCmd> {

    //日志
    static private final Logger LOGGER = LoggerFactory.getLogger(UserEntryCmdHandler.class);
    /**
     * 进行入场的消息解析
     *
     * @param cxt
     * @param cmd
     */
    @Override
    public void handle(ChannelHandlerContext cxt, GameMsgProtocol.UserEntryCmd cmd) {
        if (null == cxt
                || null == cmd) {
            return;
        }

        //获取用户id
        Integer userId = (Integer) cxt.channel().attr(AttributeKey.valueOf("userId")).get();
        if(null == userId){
            return;
        }

        //获取已经有的用户
        User exisUser = UserManager.getUserById(userId);
        if(exisUser == null){
            LOGGER.error("获取已经用户不存在 userid={}",userId);
            return;
        }

        //获取英雄形象
        String heroAvatar = exisUser.heroAvatar;

        GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();
        resultBuilder.setUserId(userId);
        resultBuilder.setHeroAvatar(heroAvatar);

        // 构建结果并发送
        GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
        Broadcaster.sendAllMsg(newResult);
    }
}
