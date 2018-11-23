package com.xbk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbk.utils.JSONUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationRedisTest {
	
//	@Autowired
//	private IRedisService redisService;
	
	@Autowired
	private JedisPool pool;
	
	@Test
	public void contextLoads() throws Exception {
//		System.out.println(redisService.get("XBK"));
		
		Jedis jedis = pool.getResource();
//		List<String> list = new ArrayList<>();
//		list.add("test1");
//		list.add("test2");
//		list.add("test3");
////		jedis.set("boottest1", "boottest1");
//		String[] strings = new String[list.size()];
//		jedis.lpush("testList", list.toArray(strings));
		List<String> lrange = jedis.lrange("testList", 0, jedis.llen("testList"));
		System.out.println(">>>>>>>>>>>>>>"+JSONUtil.toJson(lrange));
		System.out.println(">>>>>>>>>>>>>>>>>>"+jedis.get("boottest1"));
	}

}
