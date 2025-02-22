package com.messaging.SpringMessaging.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String hello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + " from BridgeLabz";
    }
    @GetMapping("/hello/param/{name}")
    public String helloWithPathVariable(@PathVariable String name) {
        return "Hello, " + name + " from BridgeLabz";
    }
    @PostMapping("/hello/post")
    public String greetUser(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
