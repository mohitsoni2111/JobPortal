package edu.ncsu.group9.jobPortal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/healthcheck")
public class TestController {

    @GetMapping("/status")
    public String getTestMessage() {
        return "All Good - Hello, this is a test message for testing Spring Boot exposed endpoint";
    }

}
