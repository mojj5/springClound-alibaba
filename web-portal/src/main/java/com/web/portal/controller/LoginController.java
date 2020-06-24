package com.web.portal.controller;

import com.web.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String login_html(){
        return "login";
    }





    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public  Object login(String user , String password, ModelMap modelMap, HttpSession session){
        LinkedMultiValueMap m = new LinkedMultiValueMap();
        m.add("grant_type","password");
        m.add("username",user);
        m.add("password",password);
        m.add("scope","all");
        m.add("client_id","appid");
        m.add("client_secret","secret");

        Object token = null;
        try {
            token = userService.login(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelMap.addAttribute("token",token);
        session.setAttribute("token",token);
        return "index";
    }



    @RequestMapping("/info")
    public Object info(ModelMap modelMap,HttpSession session){

        Object info = null;
        try {
            info = userService.info();
        } catch (Exception e) {
            e.printStackTrace();
        }

        modelMap.addAttribute("info",info);
        return "info";
    }


}

