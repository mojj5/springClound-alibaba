package com.web.portal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@FeignClient("api-gateway")
public interface UserService {


    @RequestMapping(value = "/oauth-center/oauth/token",method = RequestMethod.POST)
    public Object login( MultiValueMap patientParameter);

    @RequestMapping(value = "/user-center/user/info/{id}")
    public String info(@PathVariable("id") int id);


    @RequestMapping(value = "/aouth2-test-untitled/info")
    public String info();

   @RequestMapping(value = "/oauth-center/oauth/check_token",method = RequestMethod.GET)
    public String checkToken( @RequestParam("token")  String token);


}
