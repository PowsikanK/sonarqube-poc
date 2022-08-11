package com.vezolve.sonarqubepoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping()
    public String greeting() {
        if (true) {
            System.out.println("true = " + true);
        }
        return "Hello User!";
    }

    @GetMapping("/123")
    public String testing() {
        return "Hello Tester!";
    }
}
