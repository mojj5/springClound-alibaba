package com.business.user.controller;


import com.business.user.entity.SysUser;
import com.business.user.service.ISysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sys/user")
public class UserController {


    @Autowired
    private ISysUserService iSysUserService;


    @RequestMapping("/list")
    @PreAuthorize("hasAuthority('USER')")
    public List<SysUser> userInfo(){

        return iSysUserService.list();
    }
}
