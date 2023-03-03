package com.paobing;

import com.paobing.dao.UserDao;
import com.paobing.dao.UserInfoDao;
import com.paobing.domain.User;
import com.paobing.domain.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    private User user;
    private UserInfo userInfo;

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    void contextLoads() {
        // MyBatis测试
        user = userDao.getById(2);

        // MyBatis-Plus测试
        userInfo = userInfoDao.selectById(1);
    }

}
