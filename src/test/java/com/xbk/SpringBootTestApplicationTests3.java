package com.xbk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbk.redis.Service.IRedisService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests3 {
	
//	@Autowired
//	private IRedisService redisService;
	
	@Autowired
	private JedisPool pool;
	
	@Test
	public void contextLoads() throws Exception {
//		System.out.println(redisService.get("XBK"));
		
		Jedis jedis = pool.getResource();
//		jedis.set("boottest1", "boottest1");
		System.out.println(">>>>>>>>>>>>>>>>>>"+jedis.get("boottest1"));
	}

}
