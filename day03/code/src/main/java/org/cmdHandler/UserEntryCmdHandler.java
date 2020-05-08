package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import org.joy.game.Broadcaster;
import org.joy.game.User;
import org.model.UserManager;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 13:00
 * 进入场景的消息处理类
 */
public final class UserEntryCmdHandler implements ICmdHandler<GameMsgProtocol.UserEntryCmd>{
    /**
     * 进行入场的消息解析
     *
     * @param cxt
     * @param msg
     */
    @Override
    public void handle(ChannelHandlerContext cxt, GameMsgProtocol.UserEntryCmd msg) {
        //
        // 用户入场消息
        //
        GameMsgProtocol.UserEntryCmd cmd = msg;
        int userId = cmd.getUserId();
        String heroAvatar = cmd.getHeroAvatar();

        User newUser = new User();
        newUser.userId = userId;
        newUser.heroAvatar = heroAvatar;
        UserManager.addUser(newUser);

        GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();
        resultBuilder.setUserId(userId);
        resultBuilder.setHeroAvatar(heroAvatar);

        // 构建结果并广播
        GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
        Broadcaster.sendAllMsg(newResult);
    }
}
