package com.springboot.serverproviders.controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("eurekaServer")
public class EurekaServer {
    @RequestMapping("/HelloWorld")
    public String HelloWorld() {
        return "------------HelloWorld------------";
    }
}
