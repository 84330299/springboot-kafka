package org.chen.mq;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 21:29
 */
@Service
public class KafkaProviderServices {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sender(String topic, String value) {
        kafkaTemplate.send(topic, value);
    }

}
