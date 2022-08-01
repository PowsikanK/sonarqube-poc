package com.vezolve.sonarqubepoc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SonarqubePocApplication {

    public static void main(String[] args) {
        log.info("main called");
        SpringApplication.run(SonarqubePocApplication.class, args);
    }

}
