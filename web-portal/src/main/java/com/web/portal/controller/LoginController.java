package com.web.portal.controller;

import com.web.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public  Object login(String uesr , String pas){
        LinkedMultiValueMap m = new LinkedMultiValueMap();
        m.add("grant_type","password");
        m.add("username","admin");
        m.add("password","admin");
        m.add("scope","all");
        m.add("client_id","appid");
        m.add("client_secret","secret");
        return userService.login(m);
    }
}
