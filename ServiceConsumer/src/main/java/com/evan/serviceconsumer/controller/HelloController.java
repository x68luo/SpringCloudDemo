package com.evan.serviceconsumer.controller;

import com.evan.serviceconsumer.client.ProviderFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    ProviderFeignClient providerFeignClient;

    @RequestMapping("/hello")
    public String helloWord() {
        return providerFeignClient.helloWorld();
    }

    @RequestMapping("/echo")
    public String echo(@RequestParam("text") String text) {
        return providerFeignClient.echo(text);
    }
}
