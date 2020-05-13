package org.joy.game;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import org.cmdHandler.CmdHandlerFactory;
import org.cmdHandler.ICmdHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 15:38
 * 主线程处理器
 */
public class MainThreadProcessor {
    //日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger(MainThreadProcessor.class);
    //单例对象
    static private MainThreadProcessor _instance = new MainThreadProcessor();
    //创建一个单线程
    private final ExecutorService _es = Executors.newSingleThreadExecutor((newRunnable) -> {
        Thread newThread = new Thread(newRunnable);
        newThread.setName("MainThreadProcessor");
        return newThread;
    });

    //私有化构造器
    private MainThreadProcessor() {
    }

    //获得单例对象
    static public MainThreadProcessor getInstance() {
        return _instance;
    }

    public void process(ChannelHandlerContext ctx, GeneratedMessageV3 msg) {
        if (null == ctx || msg == null) {
            return;
        }

        Class<?> msgClazz = msg.getClass();

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
    }

    /**
     * 重载函数
     */
    public void process(Runnable r) {
        if (null != r) {
            _es.submit(r);
        }
    }

    /**
     * 转换消息对象
     *
     * @param msg
     * @param <TCmd>
     * @return
     */
    static private <TCmd extends GeneratedMessageV3> TCmd cast(Object msg) {
        if (null == msg) {
            return null;
        } else {
            return (TCmd) msg;
        }
    }
}
