package com.xbk;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbk.mybatis.mapper.InnerfundtransMapper;
import com.xbk.mybatis.model.Innerfundtrans;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationMybatisTest {
	
	@Autowired
	private InnerfundtransMapper inner;
	
	@Test
	public void contextLoads() throws Exception {
		
		Innerfundtrans record = new Innerfundtrans();
		record.setInnerfundtransnbr("1");
		record.setFundchannelcode("test");
		record.setTransamt(new BigDecimal("1"));
		record.setTransstatus("0");
		record.setOveralltransnbr("1");
		record.setTransdate(new Date());
		inner.insertSelective(record);
	}

}
