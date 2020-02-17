package com.springboot.serverconsumer;

import com.netflix.loadbalancer.RandomRule;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerconsumerApplication {
    private static Log log= LogFactory.getLog("ServerconsumerApplication.java");
    public static void main(String[] args) {
        SpringApplication.run(ServerconsumerApplication.class, args);
        log.info("-----------------Serverconsumer启动成功---------------------");
    }

    @Bean
    @LoadBalanced
        //加入负载均衡能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

