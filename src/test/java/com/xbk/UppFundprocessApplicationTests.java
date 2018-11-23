package com.xbk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbk.mybatis.mapper.MerbaseinfoMapper;
import com.xbk.mybatis.model.Merbaseinfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UppFundprocessApplicationTests {

	@Autowired
	private MerbaseinfoMapper mapper;
	
	@Test
	public void contextLoads() {
		
		Merbaseinfo m = new Merbaseinfo();
		m.setMername("测试");
		m.setMernbr("122323223");
		m.setMerstatus("0");
		mapper.insert(m);
	}

}
