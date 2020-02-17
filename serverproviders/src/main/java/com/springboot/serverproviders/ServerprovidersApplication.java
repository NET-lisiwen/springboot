package com.springboot.serverproviders;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerprovidersApplication {
    private static Log log = LogFactory.getLog("ServerprovidersApplication.java");

    public static void main(String[] args) {
        SpringApplication.run(ServerprovidersApplication.class, args);
        log.info("-----------------Serverproviders启动成功---------------------");
    }
}
