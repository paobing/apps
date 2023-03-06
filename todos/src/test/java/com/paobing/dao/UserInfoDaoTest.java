package com.paobing.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.paobing.domain.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * MyBatis-Plus
 *
 * 1. 通过IPage实现了分页需要的常规参数
 */
@SpringBootTest
public class UserInfoDaoTest {
    private UserInfo userInfo;

    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    void getRecordById(){
        userInfo = userInfoDao.selectById(1);
    }

    @Test
    void getListTest() {
        IPage page = new Page(1, 3);
        // 返回值会自动填充到page中
        userInfoDao.selectPage(page, null);

        System.out.println(page);
        System.out.println(page.getRecords());
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
    }
}
