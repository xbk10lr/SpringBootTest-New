package com.xbk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbk.dto.User;
import com.xbk.rabbitmq.senders.FanoutSender;
import com.xbk.rabbitmq.senders.HelloSender;
import com.xbk.rabbitmq.senders.ObjectSender;
import com.xbk.rabbitmq.senders.TopicSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationRabbitmqTest {
	
	@Autowired
	private HelloSender helloSender;
	
	@Autowired
	private ObjectSender objSender;
	
	@Autowired
	private TopicSender topicSender;
	
	@Autowired
	private FanoutSender fanoutSender;
	
	@Test
	public void contextLoads() throws Exception {
//		helloSender.send();
//		objSender.send(new User("1", "xubingkun", 25));
		
		topicSender.send1();
		topicSender.send2();
//		fanoutSender.send();
	}

}
