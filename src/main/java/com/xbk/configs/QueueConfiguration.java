//package com.xbk.configs;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration  
//public class QueueConfiguration {  
//      
//    //信道配置  
//    @Bean  
//    public DirectExchange defaultExchange() {  
//        return new DirectExchange("helloExchange", true, false);  
//    }  
//  
//      
//    /*********************    hello 队列  测试    *****************/  
//    @Bean  
//    public Queue queue() {  
//        Queue queue = new Queue("hello",true);  
//        return queue;   
//    }  
//  
//    @Bean  
//    public Binding binding() {  
//        return BindingBuilder.bind(queue()).to(defaultExchange()).with("hello");  
//    }  
//  
//}  