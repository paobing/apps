package com.paobing;

import com.paobing.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ServerConfig.class)
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 通过启动参数提高配置权重
        System.setProperty("spring.devtools.restart.enabled", "true");

        SpringApplication.run(Application.class, args);
    }
}
