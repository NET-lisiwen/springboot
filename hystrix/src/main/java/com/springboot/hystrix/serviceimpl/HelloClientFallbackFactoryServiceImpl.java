package com.springboot.hystrix.serviceimpl;

import com.springboot.hystrix.serviceapi.IHelloClientService;
import feign.hystrix.FallbackFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloClientFallbackFactoryServiceImpl implements FallbackFactory<IHelloClientService> {
    private static Log log = LogFactory.getLog("HelloClientFallbackFactory.java");

    @Autowired
    @Qualifier("fallback")
    IHelloClientService helloClientService;

    @Override
    public IHelloClientService create(Throwable cause) {
        log.error("feign调用发生异常，触发熔断", cause);
        return helloClientService;
    }
}