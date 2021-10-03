package com.example.arirangfirst.controllers;

import com.example.arirangfirst.networks.BaseResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    /**
     * healthCheck
     */
    @GetMapping("/")
    public BaseResponseEntity isHealthy() {
        return BaseResponseEntity.OK();
    }

}
