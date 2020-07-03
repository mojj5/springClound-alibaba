package com.web.portal.controller;

import com.web.portal.model.SysUser;
import com.web.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/sys/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(ModelMap modelMap){

        List<SysUser> list = userService.list();

        modelMap.addAttribute("users",list);

        return "user/list";
    }

}
