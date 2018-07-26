package com.mapbar.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  feign客户端demo, 通过注解的方式去调用远程服务
 *
 *  feign底层通信支持
 *  httpurlconnection，okhttp和httpclient,只需要在pom中加入相应以来就可以
 *
 */
@FeignClient(value = "eureka-client", fallback = FeignClientImpl.class)
public interface FeignClientInter {

    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
   // @Async
    String helloService(@RequestParam(value = "name") String name);

}



