package com.paobing;

import com.paobing.dao.UserDao;
import com.paobing.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    private User user;

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        user = userDao.getById(1);
        System.out.println(user);
    }

}
