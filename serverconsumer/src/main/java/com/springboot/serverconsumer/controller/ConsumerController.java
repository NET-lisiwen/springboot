package com.springboot.serverconsumer.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    private static Log log = LogFactory.getLog("ConsumerController.java");
    @Autowired
    RestTemplate restTemplate;

    String serverUrl = "http://SERVER-PROVIDE";

    @RequestMapping("/consumer")
    public String consumer(String word) {
        ResponseEntity<String> entity = restTemplate.getForEntity(serverUrl + "/eurekaServer/HelloWorld", String.class, word);
        log.info("调用服务返回值为：" + entity.getBody());
        return "调用服务返回值为：" + entity.getBody();
    }
}
