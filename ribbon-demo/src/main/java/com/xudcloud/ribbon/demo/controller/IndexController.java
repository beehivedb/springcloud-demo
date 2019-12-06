/**
 * @author : Ron
 * date :2019/12/6 14:59
 * Copyright (C) 2019-2020 The Author. all rights reserved.
 */
package com.xudcloud.ribbon.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * TODO
 * version 1.0
 */
@RestController
public class IndexController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/ribbon")
    public String index(){
        String message = template.getForObject("http://DISCOVERY-CLIENT/eureka-client", String.class);
        return "Message From Discovery Client : " + message;
    }

    public String error(){
        return "catch error";
    }
}
