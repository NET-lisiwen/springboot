package com.springboot.hystrix.serviceapi;

import com.springboot.hystrix.serviceimpl.HelloClientFallbackFactoryServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "server-provide",/*fallback=HelloClientFallbackFactoryServiceImpl.class,*/ fallbackFactory = HelloClientFallbackFactoryServiceImpl.class)
public interface IHelloClientService {

    @RequestMapping(value = "/eurekaServer/HelloWorld", method = RequestMethod.GET)
    String hello();
}
