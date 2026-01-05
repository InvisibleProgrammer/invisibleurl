package com.invisibleprogrammer.invisibleurl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityWebFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(
                    auth ->
                        auth
                            .requestMatchers("/actuator/**").permitAll()
                            .anyRequest().authenticated()
                ).build();
    }
}
