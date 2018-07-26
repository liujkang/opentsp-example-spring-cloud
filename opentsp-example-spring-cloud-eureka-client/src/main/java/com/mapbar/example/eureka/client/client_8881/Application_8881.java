package com.mapbar.example.eureka.client.client_8881;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka客户端,具体应用服务提供者
 *  @author  liujk@mapbar.com
 *  @version  2017-08-03
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableEurekaClient
@RestController
public class Application_8881 {


    @Value("${spring.application.name}")
    String applicationName;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {

        return "Hello everybody, i am " + name +" and my port number is: "+port;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application_8881.class).profiles("eureka.client.8881").web(true).run(args);
    }

}
