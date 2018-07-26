package com.mapbar.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  fegin demo controller
 */
@RestController
public class FeignController {

    @Autowired
    FeignClientInter feignClientInter;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam String name){
       return feignClientInter.helloService(name);
    }


}
