package com.xbk.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ConfigurationProperties(prefix="spring.redis.pool")
public class RedisPoolDto {
	
//  @Value("${spring.redis.pool.maxActive}")
  private int maxactive;
  
//  @Value("${spring.redis.pool.maxWait}")
  private int maxwait;
  
//  @Value("${spring.redis.pool.maxIdle}")
  private int maxidle;
  
//  @Value("${spring.redis.pool.minIdle}")
  private int minidle;

public int getMaxactive() {
	return maxactive;
}

public void setMaxactive(int maxactive) {
	this.maxactive = maxactive;
}

public int getMaxwait() {
	return maxwait;
}

public void setMaxwait(int maxwait) {
	this.maxwait = maxwait;
}

public int getMaxidle() {
	return maxidle;
}

public void setMaxidle(int maxidle) {
	this.maxidle = maxidle;
}

public int getMinidle() {
	return minidle;
}

public void setMinidle(int minidle) {
	this.minidle = minidle;
}
}
