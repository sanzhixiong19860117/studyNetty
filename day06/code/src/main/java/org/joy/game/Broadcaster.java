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
