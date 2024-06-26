package com.gosuriya.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gosuriya.springsecuritybasic.controller")
public class SpringsecuritybasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritybasicApplication.class, args);
    }

}
