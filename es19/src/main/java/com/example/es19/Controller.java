package com.example.es19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {
    @Autowired
    private Environment environment;
    @Value("${property.authCode}")
    String authCode;
    @Value("${property.devName}")
    String devName;
    @GetMapping
    public String welcomeMessage () {
        return "Welcome " + devName + " " + authCode;
    }
}
