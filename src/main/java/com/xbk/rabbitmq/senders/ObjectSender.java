package com.xbk.rabbitmq.senders;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(Object obj) {
		String context = "object " + new Date();
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("object", obj);
	}
}
