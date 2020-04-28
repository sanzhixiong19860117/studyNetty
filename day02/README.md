# 第二天游戏开发入门

## 消息协议基础

消息的设计

![](https://github.com/sanzhixiong19860117/studyNetty/blob/master/day02/image/msg.png)

1.首先前两个字节是消息的长度

2.后面两个字节是消息的编号，比如1是登录，2是返回登录，后面就是消息体



*为什么会有消息长度这个字段*

是因为会出现粘包的存在，这个是因为socket编程他是一个tcp的编程，而每一次发送的消息不一定是一次性发完整的消息，所以可能出现多个消息才能组成一个消息的这种形式，所以需要一个长度，根据长度判断我这个消息是否已经读取完毕。

粘包的的示意图

![](https://github.com/sanzhixiong19860117/studyNetty/blob/master/day02/image/msg.png/msg1.png)



## Protobuf 协议文档

准备工作：

1.下载windows下面编辑工具

[Protobufwindos转换工具](https://github.com/protocolbuffers/protobuf/releases)

下载自己对应的windows版本的工具，我是64位的就下载64位的操作

2.下载完成解压以后把盘符：photobuf/bin/protoc.exe加入到path里面，然后cmd在dos环境下打印protoc 看是否有说明文档如果有就证明已经安装完成。

3.关键命令 protoc.exe --java_out=${目标目录} .\对应的proto文件

4.文件的编写规则请参考https://www.cnblogs.com/talenth/p/5820040.html

5.使用文件在day02里面有一个GameMsgProtocol.proto这个文件



## Netty群发消息

进行主类的编写

```java
package org.joy.game;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import org.slf4j.LoggerFactory;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 14:33
 */
public class ServerGame {

    //日志类
    static private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ServerGame.class);

    public static void main(String[] args) {
        //boss客户端连接，work业务
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup work = new NioEventLoopGroup();
        //NioEventLoopGroup

        ServerBootstrap b = new ServerBootstrap();
        b.group(boss, work);//装入到线程组里面
        b.channel(NioServerSocketChannel.class);//服务器的处理信道的方式nio
        b.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(
                        new HttpServerCodec(), // Http 服务器编解码器
                        new HttpObjectAggregator(65535), // 内容长度限制
                        new WebSocketServerProtocolHandler("/websocket"), // WebSocket 协议处理器, 在这里处理握手、ping、pong 等消息
                        new GameMsgDecoder(),//自定义消息解码器
                        new GameMsgEncoder(),//游戏消息编码器
                        new GameMsgHandler() // 自定义的消息处理器
                );
            }
        });

        try {
            ChannelFuture f = b.bind(12345).sync();//进行端口的绑定

            if (f.isSuccess()) {
                LOGGER.info("服务器已经启动");
            }
            //等待关闭服务器
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

自定义消息的处理类GameMsgHandler 这个比较关键它是继承SimpleChannelInboundHandler<Object>，然后需要重写方法channelActive（这个是用户做连接的时候操作）channelRead0（这个是收到客户端进行操作）。

*问题：群发怎么实现？*

1.首先顶一个ChannelGroup这个进行装载我们连接的channel，或者是通信的渠道。

2.在channelActive方法中使用ChannelGroup.add方法增加到channel组里面

3.然后在收到的消息当中使用ChannelGroup.writeAndFlush进行发送。

4.如果有断开的时候就要删除ChannelGroup对应的channel

```java
package org.tinygame.herostory;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义的消息处理器
 */
public class GameMsgHandler extends SimpleChannelInboundHandler<Object> {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(GameMsgHandler.class);

    /**
     * 1.定义ChannelGroup用来装channel
     * 信道组, 注意这里一定要用 static,
     * 否则无法实现群发
     */
    static private final ChannelGroup _channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    //2.重写channelActive
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        if (null == ctx) {
            return;
        }

        try {
            super.channelActive(ctx);
            //3.如果有客户端加入我们就用add方法把当前用户的channel加入到组里面
            _channelGroup.add(ctx.channel());
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) {
        if (null == ctx ||
            null == msg) {
            return;
        }

        LOGGER.info(
            "收到客户端消息, msgClazz = {}, msgBody = {}",
            msg.getClass().getSimpleName(),
            msg
        );
		_channelGroup.writeAndFlush(msg);//对当前所有的用户进行发送数据
    }
}
```



## 核心的编码解码的编写

创建GameMsgDecoder的类，继承ChannelInboundHandlerAdapter，重写它的channelRead这个方法

代码如下

```java
package org.tinygame.herostory;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * 自定义的消息解码器
 */
public class GameMsgDecoder extends ChannelInboundHandlerAdapter {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(GameMsgDecoder.class);

    //接受到客户端发送的信息读
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        //判断对象是否为null跳出去
        if (null == ctx ||
            null == msg) {
            return;
        }

        //判断websocket发送过来是否是二进制的数据
        if (!(msg instanceof BinaryWebSocketFrame)) {
            return;
        }

        try {
            //二进制有一个读取习惯，如果已经读取的就会指针向后移动对应的大小
            //就转msg对象为二进制数据对象
            BinaryWebSocketFrame inputFrame = (BinaryWebSocketFrame) msg;
            ByteBuf byteBuf = inputFrame.content();//获得数据对象这里就是protobuf对象数据

            byteBuf.readShort(); // 读取消息的长度
            int msgCode = byteBuf.readShort(); // 读取消息编号

            // 拿到消息体
            byte[] msgBody = new byte[byteBuf.readableBytes()];
            byteBuf.readBytes(msgBody);

            GeneratedMessageV3 cmd = null;

            //根据固定的code进行判断是否完成那个操作
            /**
            enum MsgCode {
                USER_ENTRY_CMD = 0;
                USER_ENTRY_RESULT = 1;
                WHO_ELSE_IS_HERE_CMD = 2;
                WHO_ELSE_IS_HERE_RESULT = 3;
                USER_MOVE_TO_CMD = 4;
                USER_MOVE_TO_RESULT = 5;
                USER_QUIT_RESULT = 6;
                USER_STOP_CMD = 7;
                USER_STOP_RESULT = 8;
                USER_ATTK_CMD = 9;
                USER_ATTK_RESULT = 10;
                USER_SUBTRACT_HP_RESULT = 11;
                USER_DIE_RESULT = 12;
			};
            根据结构体的数据来写出对应的逻辑
            */
            switch (msgCode) {
                case GameMsgProtocol.MsgCode.USER_ENTRY_CMD_VALUE:
                    //parseFrom方法是实现反序列化，并且获得对象
                    cmd = GameMsgProtocol.UserEntryCmd.parseFrom(msgBody);
                    break;

                case GameMsgProtocol.MsgCode.WHO_ELSE_IS_HERE_CMD_VALUE:
                    cmd = GameMsgProtocol.WhoElseIsHereCmd.parseFrom(msgBody);
                    break;

                default:
                    break;
            }

            if (null != cmd) {
                //把数据传给对象处理类这里是GameMsgHandler
                ctx.fireChannelRead(cmd);
            }
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}
```

上面GameMsgHandler类中的channelRead0方法此时我们可以收到来自解码器的对应数据

代码如下

```java
package org.joy.game;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 15:22
 */
public class GameMsgHandler extends SimpleChannelInboundHandler<Object> {
    //日志对象
    static private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(GameMsgHandler.class);
    //这个地方增加集合操作
    static private final ChannelGroup _channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    /**
     * 用户字典
     */
    static private final Map<Integer, User> _userMap = new HashMap<>();

    //连接操作
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        if (null == ctx) {
            return;
        }
        try {
            super.channelActive(ctx);
            //添加子对象
            _channelGroup.add(ctx.channel());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
//        System.out.println("服务器收到客户端消息 msg=" + o);
        if (null == ctx || null == msg) {
            LOGGER.info("channelRead0数据或则消息体出错");
            return;
        }

        try {
            //测试的msg就是刚才解码器传过来的对应protobuf的对象
            /**
				message UserEntryCmd {
    				// 用户 Id
    				uint32 userId = 1;
    				// 英雄形象
    				string heroAvatar = 2;
				}
            */
            if (msg instanceof GameMsgProtocol.UserEntryCmd) {
                // 用户入场消息通过序列化对象以后，我们读取客户端发给我的序列化的对象的数据
                GameMsgProtocol.UserEntryCmd cmd = (GameMsgProtocol.UserEntryCmd) msg;
                int userId = cmd.getUserId();
                String heroAvatar = cmd.getHeroAvatar();

                //创建一个返回对象
                /**
                    message UserEntryResult {
                        // 用户 Id
                        uint32 userId = 1;
                        // 英雄形象
                        string heroAvatar = 2;
                   }
                */
                GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();//newBuilder()new的关键点
                resultBuilder.setUserId(userId);
                resultBuilder.setHeroAvatar(heroAvatar);

                // 构建结果并广播
                GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
                _channelGroup.writeAndFlush(newResult);
            }
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}

```

还有一个消息的编码器，负责把对应的消息编码以后发送给客户端

GameMsgEncoder，它继承ChannelOutboundHandlerAdapter重写了write方法

```java
package org.tinygame.herostory;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * 游戏消息编码器
 	继承ChannelOutboundHandlerAdapter
 */
public class GameMsgEncoder extends ChannelOutboundHandlerAdapter {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(GameMsgEncoder.class);

    //重写write方法
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
        if (null == ctx ||
            null == msg) {
            return;
        }

        try {
            if (!(msg instanceof GeneratedMessageV3)) {
                super.write(ctx, msg, promise);
                return;
            }

            // 消息编码
            int msgCode = -1;
            /**
            	message UserEntryResult {
                    // 用户 Id
                    uint32 userId = 1;
                    // 英雄形象
                    string heroAvatar = 2;
				}
            */
			//判断发送的对象是那个对象
            if (msg instanceof GameMsgProtocol.UserEntryResult) {
                //msgCode = GameMsgProtocol.MsgCode.USER_ENTRY_RESULT_VALUE;
            } else if (msg instanceof GameMsgProtocol.WhoElseIsHereResult) {
                msgCode = GameMsgProtocol.MsgCode.WHO_ELSE_IS_HERE_RESULT_VALUE;
            } else {
                LOGGER.error(
                    "无法识别的消息类型, msgClazz = {}",
                    msg.getClass().getSimpleName()
                );
                super.write(ctx, msg, promise);
                return;
            }

            // 消息体
            byte[] msgBody = ((GeneratedMessageV3) msg).toByteArray();

            ByteBuf byteBuf = ctx.alloc().buffer();//申请bytebuf这个对象的空间相当于c语言的malloc
            byteBuf.writeShort((short) msgBody.length); // 消息的长度
            byteBuf.writeShort((short) msgCode); // 消息编号
            byteBuf.writeBytes(msgBody); // 消息体

            // 写出 ByteBuf
            BinaryWebSocketFrame outputFrame = new BinaryWebSocketFrame(byteBuf);
            super.write(ctx, outputFrame, promise);
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}

```

这整个一套protobuf加websocket的基础使用，已经有一个流程了，后面的游戏的逻辑部分大同小异。