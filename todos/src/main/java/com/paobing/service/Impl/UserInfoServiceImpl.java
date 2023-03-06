package com.paobing.service.Impl;

import com.paobing.dao.UserInfoDao;
import com.paobing.domain.UserInfo;
import com.paobing.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 手动实现service层接口开发
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public Boolean save(UserInfo userInfo) {
        // 数据操作返回的是影响的行计数，大于0表示返回成功
        return userInfoDao.insert(userInfo) > 0;
    }

    @Override
    public Boolean update(UserInfo userInfo) {
        return userInfoDao.updateById(userInfo) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return userInfoDao.deleteById(id) > 0;
    }

    @Override
    public UserInfo getById(Integer id) {
        return userInfoDao.selectById(id);
    }

    @Override
    public List<UserInfo> getAll() {
        return userInfoDao.selectList(null);
    }
}
