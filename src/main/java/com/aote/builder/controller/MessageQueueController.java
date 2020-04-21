package com.aote.builder.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;
import java.util.UUID;

/**
 * @author: Weicf
 * @date: 2020-04-20 16:29
 * @description:
 */
@RestController
@RequestMapping("/mQueue")
public class MessageQueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @PostMapping("/produceMsg")
    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue,"*****" + UUID.randomUUID().toString().substring(0, 6));
    }


    @PostMapping("/queueProduce")
    public void queueProduce() {
        jmsMessagingTemplate.convertAndSend(queue,"bootQueue=====>>>>>" + UUID.randomUUID().toString().substring(0, 6));
    }

    @PostMapping("/topicProduce")
    public void topicProduce() {
        jmsMessagingTemplate.convertAndSend(topic,"bootTopic=====>>>>>" + UUID.randomUUID().toString().substring(0, 6));
    }


}
