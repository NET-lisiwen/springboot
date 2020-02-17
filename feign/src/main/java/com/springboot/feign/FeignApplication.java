package com.springboot.feign;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    private static Log log = LogFactory.getLog("FeignApplication.java");
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
        log.info("-----------------FeignApplication启动成功---------------------");
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplat() {
        return new RestTemplate();
    }
}
