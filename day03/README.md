# 重构，设计模式实战

## 1.把GameMsgHandler的ChannelGroup，和用户字典分离出去

重新创建一个类Broadcaster

```java
package org.joy.game;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 11:52
 * 增加一个广播的操作
 * 不需要继承
 */
public final class Broadcaster {
    static private final Logger LOGGER = LoggerFactory.getLogger(Broadcaster.class);
    //这个地方增加集合操作
    static private final ChannelGroup _channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    /**
     * 构造一个group
     */
    private Broadcaster() {
    }

    /**
     * 增加
     *
     * @param ch
     */
    static public void addChannel(Channel ch) {
        _channelGroup.add(ch);
    }

    /**
     * 删除
     *
     * @param ch
     */
    static public void removeChannel(Channel ch) {
        _channelGroup.remove(ch);
    }

    /**
     * 广播操作
     * @param msg
     */
    static public void sendAllMsg(Object msg) {
        if (null == msg) {
            LOGGER.error("sendAllMsg函数 msg数据为null");
            return;
        }
        _channelGroup.writeAndFlush(msg);
    }
}
```

连接的时候的代码修改为

```java
@Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
         super.channelActive(ctx);
         //添加子对象
         Broadcaster.addChannel(ctx.channel());
    }
```

目的：把广播全部分离出去，这样我们需要在任何的地方进行添加还有删除广发都可以使用这个类进行操作。设计模式的单一性的一个体现。

## 2.把用户的map进行抽离

创建UserManager类

```java
package org.model;

import org.joy.game.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 12:28
 */
public final class UserManager {
    static private final Map<Integer, User> _userMap = new HashMap<>();

    private UserManager() {
    }

    /**
     * 增加用户操作
     *
     * @param newUser
     */
    public static void addUser(User newUser) {
        if (null == newUser) {
            return;
        }
        _userMap.put(newUser.userId, newUser);
    }

    /**
     * 删除指定用户
     *
     * @param userId
     */
    public static void removeUser(int userId) {
        if (userId < 0) {
            return;
        }
        _userMap.remove(userId);
    }

    public static Collection<User> listUser(){
        return _userMap.values();
    }
}
```

修改对应的地方

```java
User newUser = new User();
                newUser.userId = userId;
                newUser.heroAvatar = heroAvatar;
                UserManager.addUser(newUser);
```

```java
for (User currUser : UserManager.listUser()) {
                    if (null == currUser) {
                        continue;
                    }

                    GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder userInfoBuilder = GameMsgProtocol.WhoElseIsHereResult.UserInfo.newBuilder();
                    userInfoBuilder.setUserId(currUser.userId);
                    userInfoBuilder.setHeroAvatar(currUser.heroAvatar);
                    resultBuilder.addUserInfo(userInfoBuilder);
                }
```

工具提取方法：ide右键点击refactor->extract->method，然后会弹出一个对话框要你填写函数名字，这样就会把你的代码单独出来。

## 3.增加两个类，对消息进行处理

增加谁在场的WhoElseIsHereCmdHandler消息处理类

```java
package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import org.joy.game.User;
import org.model.UserManager;
import org.tinygame.herostory.msg.GameMsgProtocol;
/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 16:00
 * 谁在场的指定处理
 */
public class WhoElseIsHereCmdHandler {
    //把刚才的channelRead0的消息封装到这个里面
    //这样收到消息指用传入数据其他的就不用操作了
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.WhoElseIsHereCmd msg) {
        GameMsgProtocol.WhoElseIsHereResult.Builder resultBuilder = GameMsgProtocol.WhoElseIsHereResult.newBuilder();

        for (User currUser : UserManager.listUser()) {
            if (null == currUser) {
                continue;
            }          GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder userInfoBuilder = GameMsgProtocol.WhoElseIsHereResult.UserInfo.newBuilder();
            userInfoBuilder.setUserId(currUser.userId);
            userInfoBuilder.setHeroAvatar(currUser.heroAvatar);
            resultBuilder.addUserInfo(userInfoBuilder);
        }

        GameMsgProtocol.WhoElseIsHereResult newResult = resultBuilder.build();
        ctx.writeAndFlush(newResult);
    }
}
```

增加用户进入场地的消息处理类 UserEntryCmdHandler

```java
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
public final class UserEntryCmdHandler {
    /**
     * 进行入场的消息解析
     *
     * @param cxt
     * @param msg
     */
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
```

## 4.使用多态进行封装

使用接口进行封装

```java
package org.cmdHandler;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 16:11
 * 继承这个接口进行多态操作
 */
public interface ICmdHandler<TCmd extends GeneratedMessageV3> {
    public void handle(ChannelHandlerContext ctx, TCmd cmd);
}
```

对TCmd继承和说法网站上有想写的介绍https://www.jianshu.com/p/597a4ac3c6fa

修改以后的代码就是

UserEntryCmdHandler类继承与ICmdHandler

```java
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
        GameMsgProtocol.UserEntryCmd cmd = msg;
        //解析对应的数据
        int userId = cmd.getUserId();
        String heroAvatar = cmd.getHeroAvatar();
        //解析对应的数据放入到对应里面
        User newUser = new User();
        newUser.userId = userId;
        newUser.heroAvatar = heroAvatar;
        UserManager.addUser(newUser);
        //构建发送数据然后广播到前端进行显示
        GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();
        resultBuilder.setUserId(userId);
        resultBuilder.setHeroAvatar(heroAvatar);
        // 构建结果并广播
        GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
        Broadcaster.sendAllMsg(newResult);
    }
}
```

WhoElseIsHereCmdHandler也相应的继承对应的方法

```java
package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import org.joy.game.User;
import org.model.UserManager;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 16:00
 * 谁在场的指定处理
 */
public final class WhoElseIsHereCmdHandler implements ICmdHandler<GameMsgProtocol.WhoElseIsHereCmd> {

    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.WhoElseIsHereCmd msg) {
        GameMsgProtocol.WhoElseIsHereResult.Builder resultBuilder = GameMsgProtocol.WhoElseIsHereResult.newBuilder();

        for (User currUser : UserManager.listUser()) {
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
}

```

继承后重写对应的方法，这样我们的代码更加的清爽。

## 5.使用工厂模式对指令数据进行改造

```java
package org.cmdHandler;

import com.google.protobuf.GeneratedMessageV3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 16:33
 * 指令静态工厂类
 */
public final class CmdHandlerFactory {
    /**
     * 处理器字典
     */
    static private Map<Class<?>, ICmdHandler<? extends GeneratedMessageV3>> _handlerMap = new HashMap<>();

    private CmdHandlerFactory() {
    }

    /**
     * 创建指令处理工厂
     *
     * @param msgClazz
     * @return
     */
    static public ICmdHandler<? extends GeneratedMessageV3> crate(Class<?> msgClazz) {
        if (null == msgClazz) {
            return null;
        }
        return _handlerMap.get(msgClazz);
    }
}
```

对GameMsgHandler类的channelRead0方法进行修改

修改前：

```java
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
```

修改后：

```java
@Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("服务器收到客户端消息 msg=" + msg.getClass().getName());
        ICmdHandler<? extends GeneratedMessageV3> cmdHandler = CmdHandlerFactory.crate(msg.getClass());
        if (null != cmdHandler) {
            cmdHandler.handle(ctx, cast(msg));
        }
    }
```

增加消息转换消息

```java
/**
     * 转换消息对象
     * @param msg
     * @param <TCmd>
     * @return
     */
    static private <TCmd extends GeneratedMessageV3> TCmd cast(Object msg) {
        if (null == msg) {
            return null;
        } else {
            return (TCmd)msg;
        }
    }
```



