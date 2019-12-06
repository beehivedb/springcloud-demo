/**
 * @author : Ron
 * date :2019/12/6 10:03
 * Copyright (C) 2019-2020 The Author. all rights reserved.
 */
package com.xudcloud.webflux.demo.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * TODO
 * version 1.0
 */
@RestController
@EnableEurekaClient
public class IndexController {
    @GetMapping("/mono")
    public Mono<String> index(){

        return Mono.just("Hello, Reactor.").delayElement(Duration.ofMillis(1000));
    }
}
