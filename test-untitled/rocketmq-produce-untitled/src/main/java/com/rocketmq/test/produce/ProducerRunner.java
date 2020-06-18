package com.rocketmq.test.produce;


import org.springframework.boot.CommandLineRunner;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import org.apache.rocketmq.common.message.MessageConst;
import org.apache.rocketmq.spring.support.RocketMQHeaders;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProducerRunner implements CommandLineRunner {

    @Autowired
    private MessageChannel output; // 获取name为output的binding
    @Override
    public void run(String... args) throws Exception {
        Map<String, Object> headers = new HashMap<>();
        headers.put(MessageConst.PROPERTY_TAGS, "tagStr");
        Message message = MessageBuilder.createMessage("生产消息", new MessageHeaders(headers));
        output.send(message);
    }
}