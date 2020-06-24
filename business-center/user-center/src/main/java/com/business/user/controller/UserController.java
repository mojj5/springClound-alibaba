package com.business.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public String userInfo(@PathVariable("id") int id){
        return "userInfo :" +id;
    }
}
