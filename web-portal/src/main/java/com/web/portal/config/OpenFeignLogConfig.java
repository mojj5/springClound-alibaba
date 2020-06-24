package com.web.portal.config;

import com.alibaba.nacos.api.config.filter.IFilterConfig;
import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Configuration
public class OpenFeignLogConfig  implements RequestInterceptor {

    /**
     * 打印fegin日志 方便查看报文信息
     * @return
     */
    @Bean
    Logger.Level feignLoggerLeave(){
        return Logger.Level.FULL;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpSession session = request.getSession(true);
        Object token = session.getAttribute("token");
        if (token != null){
            Map map = (Map) token;
            String access_token = (String) map.get("access_token");
            String token_type = (String) map.get("token_type");

            requestTemplate.header("Authorization","Bearer "+access_token);
        }
        System.out.println("requestTemplate:header ==="+requestTemplate);
    }
}
