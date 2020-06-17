package com.test.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ch
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RedisTest {


    public static void main(String[] args) {

        SpringApplication.run(RedisTest.class,args);
    }
}
