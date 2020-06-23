package com.test.redis.controller;

import com.inner.redis.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
public class TestController {


    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/")
    public Object test(){

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("ket",01);
        objectObjectHashMap.put("version", 10);
        objectObjectHashMap.put("date", new Date());
        redisUtils.setValue("test", objectObjectHashMap);
        Object test = redisUtils.getValue("test");
        HashMap test1 = (HashMap) test;
        System.out.println(test1.get("ket"));

        long test2 = redisUtils.getExpireTime("tests");
        System.out.println(test2);
        return test;
    }

    @PostMapping("/post")
    public Object post(@RequestBody String S){

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("ket",01);
        objectObjectHashMap.put("version", 10);
        objectObjectHashMap.put("date", new Date());
        redisUtils.setValue("test", objectObjectHashMap);
        Object test = redisUtils.getValue("test");
        HashMap test1 = (HashMap) test;
        System.out.println(test1.get("ket"));

        long test2 = redisUtils.getExpireTime("tests");
        System.out.println(test2);
        return test;
    }

}
