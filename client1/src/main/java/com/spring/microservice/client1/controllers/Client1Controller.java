package com.spring.microservice.client1.controllers;

import com.spring.microservice.client1.config.AppPropertyConfig;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/client1")
@AllArgsConstructor
public class Client1Controller
{
    AppPropertyConfig appPropertyConfig;

    @GetMapping
    public ResponseEntity<?> config()
    {
        return new ResponseEntity<>(appPropertyConfig.getProperties(), HttpStatus.OK);
    }
}
