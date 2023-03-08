package com.paobing.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServerConfigTest {

    @Autowired
    private ServerConfig serverConfig;

    @Test
    public void timeTest(){
        System.out.println(serverConfig.getTimeout());

        System.out.println(serverConfig.getDataSize());
    }
}
