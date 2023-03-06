package com.paobing.dao;

import com.paobing.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * MyBatis
 *
 * 1. 批量查询、分页需要自己实现
 */
@SpringBootTest
public class UserDaoTest {
    private User user;
    private List<User> list;

    @Autowired
    private UserDao userDao;

    @Test
    void testGetById(){
        // MyBatis测试
        user = userDao.getById(2);
    }

    @Test
    void testGetAll(){
        list = userDao.getAll();
        System.out.println(list);
    }
}
