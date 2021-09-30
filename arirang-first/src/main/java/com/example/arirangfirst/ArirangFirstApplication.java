package com.example.arirangfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ArirangFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArirangFirstApplication.class, args);
    }

}
