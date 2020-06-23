package com.web.portal.service;

import com.web.portal.model.OauthPassModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("api-gateway")
public interface UserService {


    @RequestMapping(value = "/oauth-center/oauth/token",method = RequestMethod.POST)
    public Object login( MultiValueMap patientParameter);
}
