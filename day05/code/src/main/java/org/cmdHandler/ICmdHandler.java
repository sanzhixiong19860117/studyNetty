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
