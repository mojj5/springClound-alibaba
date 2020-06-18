package aouth2.test.untitled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

// 接入oauth2 ，声明为资源服务器
@EnableResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class Aouth2Test {
    public static void main(String[] args) {
        SpringApplication.run(Aouth2Test.class,args);
    }
}
