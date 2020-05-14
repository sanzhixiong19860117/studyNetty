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
