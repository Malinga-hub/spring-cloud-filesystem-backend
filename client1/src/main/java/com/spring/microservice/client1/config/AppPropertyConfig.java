package com.spring.microservice.client1.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app.config")
@Getter @Setter
public class AppPropertyConfig {
    private String name;
    private List<String> properties;
}
