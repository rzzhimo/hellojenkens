package com.jenkins.hellojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class HellojenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellojenkinsApplication.class, args);
    }

}
