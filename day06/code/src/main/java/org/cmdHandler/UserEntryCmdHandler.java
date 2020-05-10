package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import org.joy.game.Broadcaster;
import org.model.User;
import org.model.UserManager;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 13:00
 * 进入场景的消息处理类
 */
public final class UserEntryCmdHandler implements ICmdHandler<GameMsgProtocol.UserEntryCmd> {
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

        // 从指令对象中获取用户 Id 和英雄形象
        int userId = cmd.getUserId();
        String heroAvatar = cmd.getHeroAvatar();

        GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();
        resultBuilder.setUserId(userId);
        resultBuilder.setHeroAvatar(heroAvatar);

        // 新建用户,
        User newUser = new User();
        newUser.userId = userId;
        newUser.heroAvatar = heroAvatar;
        // 并将用户加入管理器
        UserManager.addUser(newUser);

        // 将用户 Id 附着到 Channel
        cxt.channel().attr(AttributeKey.valueOf("userId")).set(userId);

        // 构建结果并发送
        GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
        Broadcaster.sendAllMsg(newResult);
    }
}
