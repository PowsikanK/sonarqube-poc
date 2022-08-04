package com.vezolve.sonarqubepoc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping()
    public String greeting() {
        return "Hello User!";
    }

    @GetMapping("/123")
    public String testing() {
        return "Hello Tester!";
    }
}
