package com.vezolve.sonarqubepoc.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {TestController.class})
@ExtendWith(SpringExtension.class)
class TestControllerTest {
    @Autowired
    private TestController testController;

    /**
     * Method under test: {@link TestController#greeting()}
     */
    @Test
    void testGreeting() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test");
        MockMvcBuilders.standaloneSetup(testController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Hello User!"));
    }

    /**
     * Method under test: {@link TestController#greeting()}
     */
    @Test
    void testGreeting2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test", "Uri Variables");
        MockMvcBuilders.standaloneSetup(testController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Hello User!"));
    }

    /**
     * Method under test: {@link TestController#testing()}
     */
    @Test
    void testTesting() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test/123");
        MockMvcBuilders.standaloneSetup(testController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Hello Tester!"));
    }

    /**
     * Method under test: {@link TestController#testing()}
     */
    @Test
    void testTesting2() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/test/123");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(testController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("Hello Tester!"));
    }
}

