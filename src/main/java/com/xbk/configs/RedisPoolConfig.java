package com.xbk.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xbk.dto.RedisPoolDto;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration  
@EnableAutoConfiguration
@ConfigurationProperties(prefix="spring.redis")
public class RedisPoolConfig {  
  
    private static Logger logger = LoggerFactory.getLogger(RedisPoolConfig.class);  
     
//    @Value("${spring.redis.host}")
    private String host;
    
//    @Value("${spring.redis.port}")
    private int port;
    
//    @Value("${spring.redis.password}")
    private String password;
    
//    @Value("${spring.redis.database}")
    private int database;
    
//    @Value("${spring.redis.timeout}")
    private int timeout;
    
    @Autowired
    private RedisPoolDto poolDto;
    
    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	@Bean
	public JedisPoolConfig getRedisConfig(){
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(poolDto.getMaxactive());
		config.setMaxWaitMillis(poolDto.getMaxwait());
		config.setMaxIdle(poolDto.getMaxidle());
		config.setMinIdle(poolDto.getMinidle());
		return config;
	}
    
    @Bean
    public JedisPool getJedisPool(){
    	JedisPool pool = new JedisPool(getRedisConfig(),host,port,timeout,password,database);
    	return pool;
    }
    
} 