package com.inner.redis.util;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class RedisUtils {


    private RedisTemplate<String, Object> redisTemplate;

    public RedisUtils() {
    }

    public RedisUtils(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    /**
     * 设置key失效时间
     *
     * @param key
     * @param time
     * @return
     */
    public boolean expire(String key, long time) {

        Boolean expire = redisTemplate.expire(key, time, TimeUnit.SECONDS);
        return expire;

    }


    /**
     * 设置key-value
     *
     * @param key
     * @param value
     * @return
     */
    public boolean setValue(String key, Object value) {

        try {
            redisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            log.info("redis-setValue:false");
            e.printStackTrace();
        }

        return true;
    }


    /**
     * 设置值并指定失效时间
     *
     * @param key
     * @param value
     * @param time
     * @return
     */
    public boolean setValueAndexpire(String key, Object value, long time) {
        try {
            redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.info("redis-setValueAndexpire:false");
            e.printStackTrace();
        }
        return true;
    }


    /**
     * 获取key-value
     *
     * @param key
     * @return
     */
    public Object getValue(String key) {

        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 删除key
     *
     * @param key
     * @return
     */
    public boolean delete(String key) {

        return redisTemplate.delete(key);

    }


    /**
     * 获取key过期时间
     * code -1:无限期
     * code -2：没有此key
     *
     * @param key
     * @return
     */
    public long getExpireTime(String key) {
        return redisTemplate.getExpire(key);
    }

    /**
     * 查询是否存在key
     *
     * @param key
     * @return
     */
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }


    /**
     * 递增
     *
     * @param key
     * @param l
     * @return
     */
    public long incr(String key, Long l) {
        if (l < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        Long increment = redisTemplate.opsForValue().increment(key, l);
        return increment;
    }

    /**
     * 递减
     *
     * @param key
     * @param l
     * @return
     */
    public long decr(String key, Long l) {
        if (l < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        Long increment = redisTemplate.opsForValue().increment(key, -l);
        return increment;
    }

    /**
     * 批量删除key
     *
     * @param key
     */
    public void deleteAll(String... key) {
        redisTemplate.delete(Arrays.asList(key));
    }

}
