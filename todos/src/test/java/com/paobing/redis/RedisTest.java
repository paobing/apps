package com.paobing.redis;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class RedisTest {

    /**
     * 不能使用@Autowired，会提示找不到对应的包
     */
    @Resource
    private RedisTemplate redisTemplate;

    /**
     * StringRedisTemplate 可以读取Terminal中的数据
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testSet(){
        // 需要指定要操作的数据类型
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("name", "paobing");
    }

    @Test
    void testGet(){
        ValueOperations ops = redisTemplate.opsForValue();
        Object name = ops.get("name");
        System.out.println(name);
    }
}
