package com.mapbar.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 * 通过ribbon+restTemplate去消费client提供的服务
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix//断路由，当ribbon请求rpc失败的时候，瞬间定位到错误方法，而不是一直在等待执行
//@EnableAsync
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
