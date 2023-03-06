package com.paobing.service;

import com.paobing.dao.UserInfoDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserInfoServiceTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    void testServiceGetById(){
        userInfoService.getById(1);
    }

    @Test
    void testServiceDeleteById(){
        Boolean bool = userInfoService.delete(1);
        System.out.println(bool);
    }
}
