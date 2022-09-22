package com.toby.JavaApi.controller;
import com.toby.JavaApi.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String HelloWorld(){
        var helloWorldService = new HelloWorldService();
        return helloWorldService.helloWorld();
    }
    @GetMapping("/hello")
    public String helloName(@RequestParam String name) {
        var helloWorldService = new HelloWorldService();
        return helloWorldService.hello(name);
    }
}