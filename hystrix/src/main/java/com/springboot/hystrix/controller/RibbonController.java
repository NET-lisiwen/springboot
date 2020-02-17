package com.springboot.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon 常规方式-示例
 * @author lisiwen
 */
@RestController
public class RibbonController {
    private static Log log= LogFactory.getLog("RibbonController.java");
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/ribbon")
    @HystrixCommand(fallbackMethod="fallback")
    public String hello() {
        log.info("使用restTemplate调用服务");
        return restTemplate.getForObject("http://server-provide/eurekaServer/HelloWorld", String.class);
    }


    /**
     * 发生熔断时调用的方法
     * @param throwable 发生异常时的异常信息
     * @return
     */
    public String fallback(Throwable throwable) {
        log.error("熔断发生了：{}", throwable);
        log.warn("restTemplate调用服务发生熔断");
        return "restTemplate调用服务发生熔断" ;
    }

}
