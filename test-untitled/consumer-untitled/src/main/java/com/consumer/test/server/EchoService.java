package com.consumer.test.server;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-provider")
public interface EchoService {

    @GetMapping(value = "/")
    String echo();
}
