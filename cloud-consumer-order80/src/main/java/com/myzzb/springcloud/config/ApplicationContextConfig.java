package com.myzzb.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author :zzb
 * @createDate :2020/9/10 13:31
 * @desc :
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced    //LoadBalanced注解开启RestTemplate负载均衡功能。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
