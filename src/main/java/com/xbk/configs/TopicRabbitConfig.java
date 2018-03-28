package com.xbk.configs;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * topic 模式，可以自由绑定交换机和队列，通过路由键（routingKey）决定交换机把消息交给哪个队列
 * 
 * Topic Exchange 转发消息主要是根据通配符。 
 * 在这种交换机下，队列和交换机的绑定会定义一种路由模式，
 * 那么，通配符就要在这种路由模式和路由键之间匹配后交换机才能转发消息。
 * @author 许秉坤
 *
 */
@Configuration
public class TopicRabbitConfig {

    final static String message = "topic.message";
    final static String messages = "topic.messages";

    @Bean
    public Queue queueMessage() {
        return new Queue(TopicRabbitConfig.message);
    }

    @Bean
    public Queue queueMessages() {
        return new Queue(TopicRabbitConfig.messages);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }
    
    @Bean
    TopicExchange exchange2() {
        return new TopicExchange("exchange3");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queueMessages, TopicExchange exchange2) {
        return BindingBuilder.bind(queueMessages).to(exchange2).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessage, TopicExchange exchange2) {
        return BindingBuilder.bind(queueMessage).to(exchange2).with("topic.#");
    }
}