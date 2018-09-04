package org.chen.mq;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 21:31
 */
@Service
@Log
public class KafkaConsumerServices {

    @KafkaListener(topics = "mytopics")
    public void consumer(String message) {
        log.info("topic message :" + message);
    }

}
