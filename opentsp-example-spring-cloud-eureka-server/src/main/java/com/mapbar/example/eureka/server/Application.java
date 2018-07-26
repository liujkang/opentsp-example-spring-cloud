package com.mapbar.example.eureka.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  eureka 服务注册中心，发现管理所有服务
 *  @author  liujk@mapbar.com
 *  @version  2017-08-03
 */
@SpringBootApplication
@EnableEurekaServer // 声明此服务为eureka服务注册中心
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
