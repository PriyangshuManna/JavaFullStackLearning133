package com.cognizant.spring_learn.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(){
        logger.info("START - sayHello()");
        String message = "Hello World!!";
        logger.info("END - sayHello()");
        return message;
    }
}
