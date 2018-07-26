package com.mapbar.example.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.tomcat.jni.Thread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 服务调用service
 *
 * 通过获取eureka注册中心提供的服务，去调用服务提供者提供的服务
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name, String.class);
    }

    public String helloError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
