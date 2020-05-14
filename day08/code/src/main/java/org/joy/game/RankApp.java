package org.joy.game;

import org.util.RedisUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 16:41
 */
public class RankApp {

    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(RankApp.class);

    /**
     * 应用主函数
     *
     * @param argvArray 命令行参数数组
     */
    static public void main(String[] argvArray) {
        RedisUtil.init();
//        MQConsumer.init();

        //LOGGER.info("排行榜应用程序启动成功!");
        System.out.println("排行榜应用程序启动成功!");
    }
}
