package com.demo.test_leak_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestLeakServiceApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestLeakServiceApplication.class);
        application.run(args);
    }
}
