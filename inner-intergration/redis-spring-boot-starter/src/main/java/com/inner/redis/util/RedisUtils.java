package com.inner.redis.util;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
public class RedisUtils {


    private RedisTemplate<String,Object>  redisTemplate;

    public RedisUtils() {
    }

    public RedisUtils(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public boolean expire(String key, long time){

       Boolean expire = redisTemplate.expire(key, time, TimeUnit.SECONDS);
       return expire;

   }


   public boolean setValue(String key,Object value){

       try {
           redisTemplate.opsForValue().set(key,value);
       } catch (Exception e) {
           log.info("redis-set:false");
           e.printStackTrace();
       }

       return true;
   }


}
