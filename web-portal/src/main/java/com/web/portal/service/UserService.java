package com.web.portal.service;

import com.web.portal.model.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("api-gateway")
public interface UserService {


    @RequestMapping(value = "/oauth-center/oauth/token",method = RequestMethod.POST)
    public Object login( MultiValueMap patientParameter);

    @RequestMapping(value = "/user-center/sys/user/list")
    public List<SysUser> list();


   @RequestMapping(value = "/oauth-center/oauth/check_token",method = RequestMethod.GET)
    public String checkToken( @RequestParam("token")  String token);


}
