package com.alexandernissen.rest.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

@Configuration
@EnableWebSecurity
public class SpringSecurityBasicConfigurationAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ((HttpSecurity)((HttpSecurity)((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)http
                .csrf().disable() // disabled in favor of JWT at a later stage
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll() // we permit all HTTP Options requests from any URL (/**)
                                                                              // i.e., we allow pre-flight HTTP requests
                .anyRequest()).authenticated()
                .and())
                //.formLogin().and()
                )
                .httpBasic(); // Use HTTP basic auth
    }
}
