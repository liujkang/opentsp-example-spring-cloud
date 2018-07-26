package com.mapbar.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujk on 2017/7/31.
 */
@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class Application {

    public static  void main(String args[]){
        SpringApplication.run(Application.class, args);
    }

}
