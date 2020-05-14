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
