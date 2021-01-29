package com.example.nacosprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test/hello/{str}")
    public String testHello(@PathVariable String str){
        System.out.println("hello");
        return "Hello "+str;
    }
}
