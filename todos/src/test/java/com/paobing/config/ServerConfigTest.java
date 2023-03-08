package com.paobing.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * 通过 webEnvironment 测试启动 web服务端口
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ServerConfigTest {

    @Autowired
    private ServerConfig serverConfig;

    @Test
    public void timeTest(){
        System.out.println(serverConfig.getTimeout());

        System.out.println(serverConfig.getDataSize());

        System.out.println(serverConfig.getNum());
    }
}
