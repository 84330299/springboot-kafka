package org.chen.controller;

import org.chen.mq.KafkaProviderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 陈亮
 * @Date: 2018/9/4 21:34
 */
@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaProviderServices kafkaProviderServices;

    @GetMapping("sendmsg")
    public String sender() {
        for (int i = 0; i < 10; i++) {
            kafkaProviderServices.sender("mytopics", "消息:" + i);
        }
        return "success";
    }


}
