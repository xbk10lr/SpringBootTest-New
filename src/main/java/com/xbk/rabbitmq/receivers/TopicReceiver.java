package com.xbk.rabbitmq.receivers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = {"topic.message","topic.messages"})
public class TopicReceiver {

    @RabbitHandler
    @RabbitListener(queues="topic.message")
    public void process(String topic) {
        System.out.println("Receiver topic.message : " + topic);
    }

    @RabbitHandler
    @RabbitListener(queues="topic.messages")
    public void process2(String topic) {
        System.out.println("Receiver topic.messages : " + topic);
    }

}