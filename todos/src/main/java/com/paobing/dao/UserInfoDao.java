package com.paobing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.paobing.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * MyBatis-Plus
 * 实体类名、数据库表名 需要保持一致    【可以使用TableName注解指定表名】
 */
@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {
}


