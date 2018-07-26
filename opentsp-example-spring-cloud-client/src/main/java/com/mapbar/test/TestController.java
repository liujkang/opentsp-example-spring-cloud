package com.mapbar.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by liujk on 2017/8/1.
 */
@RestController
public class TestController {


    @Resource(name = "appleBean")
    private AppleBean appleBean;

    @Value("${rabbitmq.host}")
    private String mqHost;

    @RequestMapping("/get")
    String hello() {
        appleBean.sayHello();
        return "mqHost: " + mqHost + "!";
    }
}
