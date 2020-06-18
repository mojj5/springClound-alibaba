package com.consumer.test.controller;

import com.consumer.test.server.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo-feign")
    public String feign() {
        return echoService.echo();
    }
}
