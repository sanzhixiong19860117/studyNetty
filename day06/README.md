---


typora-root-url: ./
---

# 单线程的设计

## 一.增加攻击的类UserAttkCmdHandler继承ICmHandler类

思路：攻击者攻击以后被攻击者掉血，现在这个掉血是写死的，已经在程序中有相应的对照，我们需要攻击者的id，被攻击者的id，以及调用的量的计算（ps这里可以自己diy）

1.首先给User对象增加一个当前血量的属性

```java
package org.model;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 22:28
 * 用户操作
 */
public class User {
    //用户id
    public int userId;

    //用户形象
    public String heroAvatar;

    //移动状态
    public final MoveState moveState = new MoveState();
    //血量
    public int currHp;
}
```

2.根据GameMsgProtocol结构攻击的消息机构我们重新写一个类UserAttkCmdHandler来进行解码逻辑操作。

```java
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
        //判断数据不能为空
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

        //创建攻击消息体
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

        //减血量
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
```

## 二.出现多线程变量不同步的问题

解决方案：使用单线程进行操作最简单还不容易出错

1.我们创建一个MainThreadProcessor的自己的单线程的类

![111](/111.png)

MainThreadprocessor是一个单例的类

核心就是创建一个单线程

```java
/**
 * 创建一个单线程
 */
private final ExecutorService _es = Executors.newSingleThreadExecutor(
        (newRunnable) -> {
            Thread newThread = new Thread(newRunnable);
            newThread.setName("MainThreadProcessor");//设置线程名字
            return newThread;
        });
```

核心在如下代码

```java
public void process(ChannelHandlerContext ctx, GeneratedMessageV3 msg) {
        if (null == ctx || null == msg) {
            return;
        }
        //获取消息类
        Class<?> msgClazz = msg.getClass();

        //线程处理
        _es.submit(() -> {
            LOGGER.info(
                    "收到客户端消息, msgClazz = {}, msg = {}",
                    msgClazz.getName(),
                    msg
            );

            ICmdHandler<? extends GeneratedMessageV3>
                    cmdHandler = CmdHandlerFactory.crate(msgClazz);
            if (null != cmdHandler) {
                cmdHandler.handle(ctx, cast(msg));
            } else {
                LOGGER.info("未找到对应的指令器,msgClazz={}", msgClazz.getName());
                return;
            }
        });
    }
```

这样做以后程序就不会出现多线程对属性进行读取的时候的错误。