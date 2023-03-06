package com.paobing.service;

import com.paobing.domain.UserInfo;

import java.util.List;

/**
 * 手动实现service开发
 */
public interface UserInfoService {
    Boolean save(UserInfo userInfo);
    Boolean update(UserInfo userInfo);
    Boolean delete(Integer id);
    UserInfo getById(Integer id);
    List<UserInfo> getAll();
}
