package org.joy.game;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 22:23
 */
public class GameMsgDecoder extends ChannelInboundHandlerAdapter {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(GameMsgDecoder.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (!(msg instanceof BinaryWebSocketFrame)) {
            return;
        }

        try {
            BinaryWebSocketFrame inputFrame = (BinaryWebSocketFrame) msg;
            ByteBuf byteBuf = inputFrame.content();

            byteBuf.readShort(); // 读取消息的长度
            int msgCode = byteBuf.readShort(); // 读取消息编号

            //获取消息构建者
            Message.Builder msgBuilder = GameMsgRecognizer.getMsgBuilderByMsgCode(msgCode);
            if (null == msgBuilder) {
                LOGGER.error("无法识别，msgcode={}", msgCode);
                return;
            }

            // 拿到消息体
            byte[] msgBody = new byte[byteBuf.readableBytes()];
            byteBuf.readBytes(msgBody);

            msgBuilder.clear();//清除数据
            msgBuilder.mergeFrom(msgBody);
            Message newMsg = msgBuilder.build();

            if (null != newMsg) {
                ctx.fireChannelRead(newMsg);
            }
        } catch (Exception ex) {
            // 记录错误日志
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}
