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

