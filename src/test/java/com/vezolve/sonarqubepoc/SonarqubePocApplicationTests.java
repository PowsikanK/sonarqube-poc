package com.vezolve.sonarqubepoc;

import com.vezolve.sonarqubepoc.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SonarqubePocApplicationTests {

    @Autowired
    TestController testController;

    @Test
    void contextLoads() {
        assertThat(testController).isNotNull();
    }


}
