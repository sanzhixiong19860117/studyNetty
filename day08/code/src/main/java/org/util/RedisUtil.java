package org.util;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 11:50
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis工具类
 */
public class RedisUtil {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisUtil.class);

    /**
     * 连接池对象
     */
    private static JedisPool _jedisPool = null;

    /**
     * 私有化构造函数
     */
    private RedisUtil(){
    }

    /**
     * 初始化
     */
    public static void init(){
        try {
            _jedisPool = new JedisPool("127.0.0.1",6379);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }
    }

    /**
     * 获取Ridis 实例
     */
    public static Jedis getJedis(){
        if(null == _jedisPool){
            throw new RuntimeException("_jedisPool 没有初始化");
        }

        Jedis jedis = _jedisPool.getResource();//从池子里拿到对象
        return jedis;
    }
}
