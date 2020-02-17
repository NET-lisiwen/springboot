package com.springboot.eurekaserver;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {
    private static Log log = LogFactory.getLog("EurekaserverApplication.java");

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverApplication.class, args);
        log.info("---------------------Eurekaserver启动成功---------------------");
    }
}
