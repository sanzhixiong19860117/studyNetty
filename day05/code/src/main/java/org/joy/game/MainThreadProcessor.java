package org.joy.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/10 18:08
 */
public class MainThreadProcessor {
    /**
     * 日志类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MainThreadProcessor.class);
    /**
     * 单例模式
     */
    private static final MainThreadProcessor _inter = new MainThreadProcessor();

    /**
     * 创建一个单线程
     */
    private final ExecutorService _es = Executors.newSingleThreadExecutor(
            (newRunnable) -> {
                Thread newThread = new Thread(newRunnable);
                newThread.setName("MainThreadProcessor");//设置线程名字
                return newThread;
            });

    //私有化构造器
    private MainThreadProcessor() {
    }

    public static MainThreadProcessor getInter() {
        return _inter;
    }
}
