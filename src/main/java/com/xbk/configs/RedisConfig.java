/*package com.xbk.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

@Configuration  
@EnableAutoConfiguration  
public class RedisConfig {  
  
    private static Logger logger = LoggerFactory.getLogger(RedisConfig.class);  
     
    @Value("${spring.redis.pool.maxActive}")
    private int maxActive;
    
    @Value("${spring.redis.pool.maxWait}")
    private int maxWait;
    
    @Value("${spring.redis.pool.maxIdle}")
    private int maxIdle;
    
    @Value("${spring.redis.pool.minIdle}")
    private int minIdle;
    
    @Bean
//	@ConfigurationProperties(prefix="spring.redis.pool")
	public JedisPoolConfig getRedisConfig(){
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(maxIdle);
		config.setMinIdle(minIdle);
		config.setMaxTotal(maxActive);
		config.setMaxWaitMillis(maxWait);
		return config;
	}
    
    @Bean  
    @ConfigurationProperties(prefix="spring.redis")  
    public JedisConnectionFactory getConnectionFactory(){  
//        JedisConnectionFactory factory = new JedisConnectionFactory(getRedisConfig());  
        JedisConnectionFactory factory = new JedisConnectionFactory();  
        factory.setPoolConfig(getRedisConfig());
        logger.info("JedisConnectionFactory bean init success.");  
        return factory;  
    }  
      
      
    @Bean  
    public RedisTemplate<?, ?> getRedisTemplate(){  
        RedisTemplate<?,?> template = new StringRedisTemplate(getConnectionFactory());  
        return template;  
    }  
} */