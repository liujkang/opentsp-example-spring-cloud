package com.mapbar.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务访问测试
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return ribbonService.helloService(name);
    }

}
