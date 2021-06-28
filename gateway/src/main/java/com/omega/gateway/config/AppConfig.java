package com.omega.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 *
 * @author ENGCARVALHO
 */

@Configuration
public class AppConfig {
    
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public JwtAccessTokenConverter accessTokenConverter () {
        
        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        
        tokenConverter.setSigningKey("liMWdejtr/7Bw46vtyF2f8U9BXDgG1y8Q6WQA1X/C3E=");
        
        return tokenConverter;
    }
    
    @Bean
    public JwtTokenStore tokenStore () {
        return new JwtTokenStore(accessTokenConverter());
    }
}
