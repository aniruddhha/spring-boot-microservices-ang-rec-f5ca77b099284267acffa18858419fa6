package com.ani.pqr.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @LoadBalanced // you are enabling client side load balancing by ribbon
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
