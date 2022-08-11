package com.vezolve.sonarqubepoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
final int num =1;
    @GetMapping()
    public String greeting() {
        if (num == 1) {
            System.out.println("true = " + 1);
        }
        return "Hello User!";
    }

    @GetMapping("/123")
    public String testing() {
        return "Hello Tester!";
    }
}
