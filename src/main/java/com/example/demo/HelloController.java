package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot is running!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello! " + name;
    }

    @GetMapping("/user")
    public User getUser() {
        return new User("Taro", 20);
    }

    @GetMapping("/book")
    public Book getBook() {
        return new Book("チ。", "魚豊", 1500);
    }

}
