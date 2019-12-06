/**
 * @author : Ron
 * date :2019/12/6 15:08
 * Copyright (C) 2019-2020 The Author. all rights reserved.
 */
package com.xudcloud.ribbon.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 * version 1.0
 */
@Configuration
public class ConfigRibbonClientApplication {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
