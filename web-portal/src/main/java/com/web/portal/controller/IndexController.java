package com.web.portal.controller;

import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/main")
    public String main(){

        return "main";
    }
}
