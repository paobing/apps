package com.paobing;

import com.paobing.dao.UserDao;
import com.paobing.dao.UserInfoDao;
import com.paobing.domain.User;
import com.paobing.domain.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("testing...");
    }
}
