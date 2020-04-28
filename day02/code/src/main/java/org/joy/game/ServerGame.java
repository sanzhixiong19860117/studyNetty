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

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 14:33
 */
public class ServerGame {

    static private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ServerGame.class);

    public static void main(String[] args) {
        //boss客户端连接，work业务
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup work = new NioEventLoopGroup();
        //NioEventLoopGroup

        ServerBootstrap b = new ServerBootstrap();
        b.group(boss, work);
        b.channel(NioServerSocketChannel.class);
        b.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(
                        new HttpServerCodec(), // Http 服务器编解码器
                        new HttpObjectAggregator(65535), // 内容长度限制
                        new WebSocketServerProtocolHandler("/websocket"), // WebSocket 协议处理器, 在这里处理握手、ping、pong 等消息
                        new GameMsgHandler() // 自定义的消息处理器
                );
            }
        });

        try {
            ChannelFuture f = b.bind(12345).sync();

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
