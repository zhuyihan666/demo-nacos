package com.example.nacoscousmer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("nacos-provider")
@Component
public interface Test {
    @RequestMapping("/test/hello/{str}")
    public String testHello(@PathVariable(value = "str") String str);
}
