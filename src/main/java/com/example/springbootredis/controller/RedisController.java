package com.example.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class RedisController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @RequestMapping(value = "/hello")
    public Object hello() {
        redisTemplate.opsForValue().set("key_test", "hello world");
        return redisTemplate.opsForValue().get("key_test");
    }
}
