

# mq排行榜

## 1.redis的基础应用

1.windows的安装

基础请看：https://www.runoob.com/redis/redis-tutorial.html

命令行查看：http://doc.redisfans.com/ 

2.要使用的命令

- hset、hget；
- hincrby
- zadd
- zrange、zrevrange

## 2.增加redis的包

```xml
<!-- https://mvnrepository.com/artifact/redis.clients/jedis -->
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>3.3.0</version>
</dependency>
```

## 3.编写管理redis的类

```java
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

```

## 4.编写排行榜的服务器信息

1.编写榜行榜服务器的时候先编写排行榜的vo对象

```java
package org.rank;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 16:27
 * 排行榜的对象
 */
public class RanItem {
    /**
     * 排行榜id
     */
    public int rankId;
    /**
     * 用户id
     */
    public int userId;
    /**
     * 用户名称
     */
    public String userName;
    /**
     * 英雄形象
     */
    public String heroAvatar;
    /**
     * 输赢次数
     */
    public int win;
}
```

然后编写排行榜对应的服务模块，这里和以前的登录模块一样，单独的一个io线程进行操作。

```java
package org.rank;

import com.alibaba.fastjson.JSONObject;
import org.async.AsyncOperationProcessor;
import org.async.IAsyncOperaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.util.RedisUtil;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import redis.clients.jedis.Tuple;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 16:31
 * 排行榜服务器
 */
public class RankService {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(RankService.class);

    /**
     * 单例对象
     */
    static private final RankService _instance = new RankService();

    /**
     * 私有化类默认构造器
     */
    private RankService() {
    }

    /**
     * 获取单例对象
     *
     * @return 排行榜服务
     */
    static public RankService getInstance() {
        return _instance;
    }

    /**
     * 获取排行榜
     *
     * @param callback 回调函数
     */
    public void getRank(Function<List<RanItem>, Void> callback) {
        if (null == callback) {
            return;
        }
        //核心部分限执行这块
        IAsyncOperaction asyncOp = new AsyncGetRank() {
            @Override
            public void doFinish() {
                callback.apply(this.getRankItemList());
            }
        };
		//在执行主线程
        AsyncOperationProcessor.getInstance().process(asyncOp);
    	//核心结束
    }

    /**
     * 异步方式获取排行榜
     */
    private class AsyncGetRank implements IAsyncOperaction {
        /**
         * 排名条目列表
         */
        private List<RanItem> _rankItemList = null;

        /**
         * 获取排名条目列表
         *
         * @return 排名条目列表
         */
        public List<RanItem> getRankItemList() {
            return _rankItemList;
        }

        @Override
        public void doAsync() {
            try (Jedis redis = RedisUtil.getJedis()) {
                // 获取字符串集合0-9十条数据
                Set<Tuple> valSet = redis.zrevrangeWithScores("Rank", 0, 9);

                _rankItemList = new ArrayList<>();
                int rankId = 0;

                for (Tuple t : valSet) {
                    // 获取用户 Id
                    int userId = Integer.parseInt(t.getElement());//t.getElement()相当于用户id

                    // 获取用户基本信息
                    String jsonStr = redis.hget("User_" + userId, "BasicInfo");
                    if (null == jsonStr) {
                        continue;
                    }

                    // 创建排名条目
                    RanItem newItem = new RanItem();
                    newItem.rankId = ++rankId;
                    newItem.userId = userId;
                    newItem.win = (int) t.getScore();

                    JSONObject jsonObj = JSONObject.parseObject(jsonStr);

                    newItem.userName = jsonObj.getString("userName");
                    newItem.heroAvatar = jsonObj.getString("heroAvatar");

                    _rankItemList.add(newItem);
                }
            } catch (Exception ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }

        /**
         * 刷新排行榜
         *
         * @param winnerId 赢家 Id
         * @param loserId  输家 Id
         */
        public void refreshRank(int winnerId, int loserId) {
            try (Jedis redis = RedisUtil.getJedis()) {
                // 增加用户的胜利和失败次数
                redis.hincrBy("User_" + winnerId, "Win", 1);
                redis.hincrBy("User_" + loserId, "Lose", 1);

                // 看看赢家总共赢了多少次?
                String winStr = redis.hget("User_" + winnerId, "Win");
                int winInt = Integer.parseInt(winStr);

                // 修改排名数据
                redis.zadd("Rank", winInt, String.valueOf(winnerId));
            } catch (Exception ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
    }
}
```

然后我们可以用zadd User_1 Rank 1 2 这个命令进行查询我们的排行榜的数据是否已经生成。

## 5.mq的基础使用

1.windows安装

https://www.jianshu.com/p/4a275e779afa

2.启动

cd到bin下运行：start mqnamesrv.cmd

然后在启动broker：start mqbroker.cmd -n 127.0.0.1:9876 autoCreateTopicEnable=true

这两个启动了就不要关闭了（注意：不要用太高的jdk版本，不然不好弄，我用的jdk8的版本）

## 6.创建mq的对象信息

```java
package org.tinygame.herostory.mq;

/**
 * 战斗结果消息
 */
public class VictorMsg {
    /**
     * 赢家 Id
     */
    public int winnerId;

    /**
     * 输家 Id
     */
    public int loserId;
}
```

## 7.创建mq的服务类

```java
package org.rank;

import com.alibaba.fastjson.JSONObject;
import org.async.AsyncOperationProcessor;
import org.async.IAsyncOperaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.util.RedisUtil;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import redis.clients.jedis.Tuple;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 16:31
 * 排行榜服务器
 */
public class RankService {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(RankService.class);

    /**
     * 单例对象
     */
    static private final RankService _instance = new RankService();

    /**
     * 私有化类默认构造器
     */
    private RankService() {
    }

    /**
     * 获取单例对象
     *
     * @return 排行榜服务
     */
    static public RankService getInstance() {
        return _instance;
    }

    /**
     * 获取排行榜
     *
     * @param callback 回调函数
     */
    public void getRank(Function<List<RanItem>, Void> callback) {
        if (null == callback) {
            return;
        }

        IAsyncOperaction asyncOp = new AsyncGetRank() {
            @Override
            public void doFinish() {
                callback.apply(this.getRankItemList());
            }
        };

        AsyncOperationProcessor.getInstance().process(asyncOp);
    }

    /**
     * 异步方式获取排行榜
     */
    private class AsyncGetRank implements IAsyncOperaction {
        /**
         * 排名条目列表
         */
        private List<RanItem> _rankItemList = null;

        /**
         * 获取排名条目列表
         *
         * @return 排名条目列表
         */
        public List<RanItem> getRankItemList() {
            return _rankItemList;
        }

        @Override
        public void doAsync() {
            try (Jedis redis = RedisUtil.getJedis()) {
                // 获取字符串集合
                Set<Tuple> valSet = redis.zrevrangeWithScores("Rank", 0, 9);

                _rankItemList = new ArrayList<>();
                int rankId = 0;

                for (Tuple t : valSet) {
                    // 获取用户 Id
                    int userId = Integer.parseInt(t.getElement());

                    // 获取用户基本信息
                    String jsonStr = redis.hget("User_" + userId, "BasicInfo");
                    if (null == jsonStr) {
                        continue;
                    }

                    // 创建排名条目
                    RanItem newItem = new RanItem();
                    newItem.rankId = ++rankId;
                    newItem.userId = userId;
                    newItem.win = (int) t.getScore();

                    JSONObject jsonObj = JSONObject.parseObject(jsonStr);

                    newItem.userName = jsonObj.getString("userName");
                    newItem.heroAvatar = jsonObj.getString("heroAvatar");

                    _rankItemList.add(newItem);
                }
            } catch (Exception ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
    }

    /**
     * 刷新排行榜
     *
     * @param winnerId 赢家 Id
     * @param loserId  输家 Id
     */
    public void refreshRank(int winnerId, int loserId) {
        try (Jedis redis = RedisUtil.getJedis()) {
            // 增加用户的胜利和失败次数
            redis.hincrBy("User_" + winnerId, "Win", 1);
            redis.hincrBy("User_" + loserId, "Lose", 1);

            // 看看赢家总共赢了多少次?
            String winStr = redis.hget("User_" + winnerId, "Win");
            int winInt = Integer.parseInt(winStr);

            // 修改排名数据
            redis.zadd("Rank", winInt, String.valueOf(winnerId));
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
    }
}
```

## 8.创建mq的消费者类，还有生产者类

生产类

```java
package org.mq;

import com.alibaba.fastjson.JSONObject;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 18:03
 * 消息的队列产生者
 */
public class MQProducer {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(MQProducer.class);

    /**
     * 生产者对象
     */
    static private DefaultMQProducer _producer = null;

    /**
     * 默认构造器
     */
    static public void init() {
        try {
            //创建生产者
            DefaultMQProducer producer = new DefaultMQProducer("herostory");
            //指定对应的地址
            producer.setNamesrvAddr("127.0.0.1:9876");
            //启动生产者
            producer.start();
            producer.setRetryTimesWhenSendFailed(3);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    static public void sendMsg(String topic,Object msg){
        if(null == topic
        || null == msg){
            return;
        }

        if(null == _producer){
            throw new RuntimeException("_producer 没有初始化");
        }

        Message mqMsg = new Message();
        mqMsg.setTopic(topic);
        mqMsg.setBody(JSONObject.toJSONBytes(msg));

        try{
            _producer.send(mqMsg);
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
        }
    }
}
```

```java
package org.mq;

import com.alibaba.fastjson.JSONObject;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.rank.RankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 18:59
 * 消费者
 */
public class MQConsumer {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(MQConsumer.class);

    /**
     * 私有化类默认构造器
     */
    private MQConsumer() {
    }

    /**
     * 初始化
     */
    static public void init(){
        //消费者
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("herostory");
        //设置地址
        consumer.setNamesrvAddr("127.0.0.1:9876");

        try {
            consumer.subscribe("Victor","*");
            // 注册回调
            consumer.registerMessageListener(new MessageListenerConcurrently() {
                @Override
                public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgExtList, ConsumeConcurrentlyContext ctx) {
                    for (MessageExt msgExt : msgExtList) {
                        // 解析战斗结果消息
                        VictorMsg mqMsg = JSONObject.parseObject(
                                msgExt.getBody(),
                                VictorMsg.class
                        );

                        LOGGER.info(
                                "从消息队列中收到战斗结果, winnerId = {}, loserId = {}",
                                mqMsg.winnerId,
                                mqMsg.loserId
                        );

                        // 刷新排行榜
                        RankService.getInstance().refreshRank(mqMsg.winnerId, mqMsg.loserId);

                    }
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
            });

            consumer.start();
        } catch (MQClientException e) {
            LOGGER.error(e.getMessage(),e);
        }
    }
}
```

生产消费的实力对象

```java
package org.mq;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 18:00
 */
public class VictorMsg {
    /**
     * 赢家 Id
     */
    public int winnerId;

    /**
     * 输家 Id
     */
    public int loserId;
}
```

最后是一个最后新的地方：我单独使用一个进程来跑这个业务，于是我但是使用了一个main方法来启动。

```java
package org.joy.game;

import org.mq.MQConsumer;
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
        MQConsumer.init();

        LOGGER.info("排行榜应用程序启动成功!");
    }
}
```