package org.joy.game;

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
 * @author joy
 * @version 1.0
 * @date 2020/4/28 22:26
 * 解码器
 */
public class GameMsgEncoder extends ChannelOutboundHandlerAdapter {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(GameMsgEncoder.class);

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
            int msgCode = GameMsgRecognizer.getMsgCodeByMsgClazz(msg.getClass());

            if (msgCode <= -1) {
                LOGGER.error("无法识别msgClass={}",msg.getClass().getName());
                return;
            }

            //删掉没有的部分
//            if (msg instanceof GameMsgProtocol.UserEntryResult) {
//                msgCode = GameMsgProtocol.MsgCode.USER_ENTRY_RESULT_VALUE;
//            } else if (msg instanceof GameMsgProtocol.WhoElseIsHereResult) {
//                msgCode = GameMsgProtocol.MsgCode.WHO_ELSE_IS_HERE_RESULT_VALUE;
//            } else {
//                LOGGER.error(
//                        "无法识别的消息类型, msgClazz = {}",
//                        msg.getClass().getSimpleName()
//                );
//                super.write(ctx, msg, promise);
//                return;
//            }

            //消息体
            byte[] msgBody = ((GeneratedMessageV3)msg).toByteArray();

            ByteBuf byteBuf = ctx.alloc().buffer();
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
