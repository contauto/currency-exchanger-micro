package com.berkemaktav.limitservice.controller;

import com.berkemaktav.limitservice.config.Configuration;
import com.berkemaktav.limitservice.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limit")
    public Limit retrieveLimitsFromConfigurations() {
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
}
