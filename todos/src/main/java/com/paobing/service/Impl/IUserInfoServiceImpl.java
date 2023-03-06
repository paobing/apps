package com.paobing.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.paobing.dao.UserInfoDao;
import com.paobing.domain.UserInfo;
import com.paobing.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 * 通过mybatis-plus实现services开发
 * 报错提示：https://blog.csdn.net/PhilsphyPrgram/article/details/118651271
 */
@Service
public class IUserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements IUserInfoService {
}
