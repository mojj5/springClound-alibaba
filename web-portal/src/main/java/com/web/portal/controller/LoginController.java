package com.web.portal.controller;

import com.web.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

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
//        m.add("grant_type","client_credentials");
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






    @RequestMapping("/checkToken")
    @ResponseBody
    public Object checkToken(ModelMap modelMap,HttpSession session){

        String info = null;
        try {
            Object token = session.getAttribute("token");

                Map map = (Map) token;
                String access_token = (String) map.get("access_token");

            info = userService.checkToken(access_token);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return info;
    }

}

