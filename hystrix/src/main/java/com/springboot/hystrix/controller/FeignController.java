package com.springboot.hystrix.controller;

import com.springboot.hystrix.serviceapi.IHelloClientService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign 方式-示例
 * @author lisiwen
 */
@RestController
public class FeignController {
    private static Log log= LogFactory.getLog("FeignController.java");
    @Autowired
    IHelloClientService helloClientService;

    @GetMapping("/feign")
    public String hello2() {
        log.info("使用feign调用服务");
        return helloClientService.hello();
    }
}
