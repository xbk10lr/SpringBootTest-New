package com.xbk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbk.dto.City;
import com.xbk.dto.User;
import com.xbk.redis.RedisService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests2 {
    private  Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
    private RedisService service;
	
	@Test
	public void contextLoads() throws Exception {
		User user=new User("student1","name",19);
        service.addUser(user);

        logger.info("RedisTest执行完成，return {}",service.getStudent(user.getId()).getId());

        City city=new City("city1","400500","深圳");
        service.addCity(city);
	}

}
