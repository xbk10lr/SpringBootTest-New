package com.xbk.rabbitmq.receivers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = {"topic.message","topic.messages"})
public class FanoutReceiver {

    @RabbitHandler
    @RabbitListener(queues="fanout.A")
    public void process(String topic) {
        System.out.println("ReceiverA  : " + topic);
    }
    
    @RabbitHandler
    @RabbitListener(queues="fanout.B")
    public void process2(String topic) {
        System.out.println("ReceiverB  : " + topic);
    }
    
    @RabbitHandler
    @RabbitListener(queues="fanout.C")
    public void process3(String topic) {
        System.out.println("ReceiverC  : " + topic);
    }

}