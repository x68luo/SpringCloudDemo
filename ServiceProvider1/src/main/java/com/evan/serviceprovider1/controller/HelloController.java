package com.evan.serviceprovider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String helloWord() {
        return "Hello World 1!";
    }

    @RequestMapping("/echo")
    public String echo(@RequestParam("text") String text) {
        return "Provider1 echo" +  text;
    }
}
