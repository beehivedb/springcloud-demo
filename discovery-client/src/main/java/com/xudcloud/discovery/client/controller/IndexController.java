/**
 * @author : Ron
 * date :2019/12/6 14:13
 * Copyright (C) 2019-2020 The Author. all rights reserved.
 */
package com.xudcloud.discovery.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * version 1.0
 */
@RestController
public class IndexController {
    @GetMapping("/eureka-client")
    public String index(){
        return "Hello, Eureka Client";
    }
}
