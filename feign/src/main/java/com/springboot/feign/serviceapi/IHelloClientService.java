package com.springboot.feign.serviceapi;

import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "server-provide")
public interface IHelloClientService {
    @RequestMapping(value = "/eurekaServer/HelloWorld", method = RequestMethod.GET)
    String hello();
}