package com.test.redis.controller;

import com.inner.redis.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/")
    public Object test(){

        redisUtils.setValue("test", "test world !");

        return "test";
    }
}
