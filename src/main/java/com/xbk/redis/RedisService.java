package com.xbk.redis;

import java.util.HashSet;
import java.util.Set;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.xbk.dto.City;
import com.xbk.dto.User;

//@Service
public class RedisService {

//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;

    private Set<User> users = new HashSet<User>();

    private Set<City> cities = new HashSet<City>();

//    @CachePut(value = "user", key = "'User:'+#user.id")
    public User addUser(User user) {
        users.add(user);
        return user;
    }

//    @Cacheable(value = "user", key = "'User:'+#id")
    public User addUser(String id, String name, int age) {
        User user = new User(id, name, age);
        users.add(user);
        return user;
    }

//    @Cacheable(value = "user", key = "'User:'+#id")
    public User getStudent(String id) {
        System.out.println("not in redis cache");
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

//    @CachePut(value = "city", key = "'City:'+#city.id")
    public City addCity(City city) {
        cities.add(city);
        return city;
    }
}