package com.aote.builder.configuration;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.RedeliveryPolicy;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 *
 */
@Component
@EnableJms // 表示开启jms注解
@Configuration
public class ActiveMQConfigurer {

    @Value("${myQueue}")
    private String myQueue;

    @Value("${myTopic}")
    private String myTopic;

    @Bean //<bean id="" class=""> 相当于配置
    public Queue queue() {
        return new ActiveMQQueue(myQueue);
    }

    @Bean //<bean id="" class=""> 相当于配置
    public Topic topic() {
        return new ActiveMQTopic(myTopic);
    }

}
