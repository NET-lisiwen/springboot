package com.springboot.hystrix;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
public class HystrixApplication {
    private static Log log = LogFactory.getLog("HystrixApplication.java");

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
        log.info("-----------------Hystrix启动成功---------------------");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplat() {
        return new RestTemplate();
    }
}
