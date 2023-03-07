package com.paobing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "env")
public class ServerConfig {
    private String name;
}
