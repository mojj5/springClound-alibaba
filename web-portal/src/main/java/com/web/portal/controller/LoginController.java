package com.web.portal.controller;

import com.web.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @Autowired
    UserService userService;


    @RequestMapping("/")
    public  Object login(String uesr , String pas){
        return userService.login();
    }
}
