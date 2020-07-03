package com.business.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@MapperScan("com.business.user.mapper")
@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
public class UserCenterApp {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApp.class, args);
    }
}
