package com.web.portal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("api-gateway")
@RequestMapping("/service-provider")
public interface UserService {



    @RequestMapping("/")
    public Object login();


}
