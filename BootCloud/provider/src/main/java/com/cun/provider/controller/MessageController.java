package com.cun.provider.controller;

import com.cun.provider.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/get")
    public String getMessage(){
        return "provider提供信息："+messageService.getMessage();
    }

}
