package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {
    private static final String[] SWAGGER_URLS = {
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/META-INF/resources/webjars/**",
            "/v3/api-docs/**",
            "/swagger-ui/**"
    };

    @Override
    public void configure(WebSecurity webSecurity) {
        // Allow non-secured endpoints
        webSecurity.ignoring()
                .antMatchers(SWAGGER_URLS);
    }
}
