package com.kasi.fruit.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kasi.fruit.api.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-15 14:32
 * @Version:
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.eat("apple");
    }
}
