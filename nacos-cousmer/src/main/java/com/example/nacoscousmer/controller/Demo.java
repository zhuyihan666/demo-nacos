package com.example.nacoscousmer.controller;

import com.example.nacoscousmer.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @Autowired
    private Test test;

    @RequestMapping("/demo/{str}")
    public String demo1(@PathVariable(value = "str") String str){
       return test.testHello(str);
    }
}
