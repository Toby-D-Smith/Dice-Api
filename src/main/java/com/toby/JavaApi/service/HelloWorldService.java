package com.toby.JavaApi.service;

public class HelloWorldService {
    public String helloWorld() {
        return "hello world";
    }
    public String hello(String name) {
        System.out.println(name.toUpperCase());
        if (name.toUpperCase().equals("TOBY")) {
            System.out.println("IN IF STATEMENT");
            name = "Toblerone";
        }
        if (name.toUpperCase().equals("SID")) {
            System.out.println("IN IF STATEMENT");
            name = "Sindrome";
        }
        System.out.println(name);
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        String message = String.format("hello %s%s", name, '!');
        System.out.println(message);
        return message;
    }
}
