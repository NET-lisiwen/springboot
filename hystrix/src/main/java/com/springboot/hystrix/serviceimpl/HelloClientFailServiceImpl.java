package com.springboot.hystrix.serviceimpl;

import com.springboot.hystrix.serviceapi.IHelloClientService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("fallback")
public class HelloClientFailServiceImpl implements IHelloClientService {
    private static Log log = LogFactory.getLog("HelloClientFailServiceImpl.java");

    @Override
    public String hello() {
        log.error("restTemplate调用[hello]服务发生熔断");
        return "restTemplate调用[hello]服务发生熔断";
    }
}
