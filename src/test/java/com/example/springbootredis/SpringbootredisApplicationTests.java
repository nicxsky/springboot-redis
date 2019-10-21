package com.example.springbootredis;

import com.example.springbootredis.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootredisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
    }

    @Test
    void testRedis(){
        System.out.println("key is exist:" + redisUtil.hasKey("key_test"));

        long expire = redisUtil.getExpire("key_test");
        System.out.println(expire);

        System.out.println("set expire:" + redisUtil.setExpire("key_test", 10));

        expire = redisUtil.getExpire("key_test");
        System.out.println(expire);

        System.out.println("key is exist:" + redisUtil.hasKey("key_test"));

    }

}
