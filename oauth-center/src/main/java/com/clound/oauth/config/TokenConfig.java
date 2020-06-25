package com.clound.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * 令牌管理
 */
@Configuration
public class TokenConfig {


    @Bean
    public TokenStore inMemoryTokenStore(){
        // 内存存储
        return new InMemoryTokenStore();
    }


}
