package com.epam.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/helloService")
    public String sayHello()
    {
        return "hello service";
    }
}
