package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import org.joy.game.Broadcaster;
import org.login.db.LoginSerice;
import org.login.db.UserEntiy;
import org.model.User;
import org.model.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 17:09
 * 登录消息处理
 */
public class UserLoginCmdHandler implements ICmdHandler<GameMsgProtocol.UserLoginCmd> {
    //日志
    private static final Logger LOGGER = LoggerFactory.getLogger(UserLoginCmdHandler.class);

    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.UserLoginCmd cmd) {
        if (ctx == null || cmd == null) {
            LOGGER.error("UserLoginCmdHandler ctx={},cnd={}");
            return;
        }

        //获取数据
        String userName = cmd.getUserName();
        String passWord = cmd.getPassword();

        //登录对象
        UserEntiy userEntiy = null;
        try {
            userEntiy = LoginSerice.getInster().userLogin(userName, passWord);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return;
        }

        if (null == userEntiy) {
            LOGGER.error("登录失败 userName={}", cmd.getUserName());
            return;
        }

        //新建用户
        User newUser = new User();
        newUser.userId = userEntiy.getUserId();
        newUser.userName = userEntiy.getUserName();
        newUser.heroAvatar = userEntiy.getHeroAvatar();
        newUser.currHp = 100;

        UserManager.addUser(newUser);

        //放入缓存里面
        ctx.channel().attr(AttributeKey.valueOf("userId")).set(newUser.userId);

        //登录返回结果构建
        GameMsgProtocol.UserLoginResult.Builder result = GameMsgProtocol.UserLoginResult.newBuilder();
        result.setUserId(newUser.userId);
        result.setUserName(newUser.userName);
        result.setHeroAvatar(newUser.heroAvatar);

        GameMsgProtocol.UserLoginResult newResult = result.build();
        ctx.writeAndFlush(newResult);
    }
}
