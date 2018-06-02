package com.cun.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/show")
    public String showMessage(){
        String s = restTemplate.getForObject("http://provider-message/get", String.class);
        return "consumer获取信息："+s;
    }

}
