package com.paobing.dao;

import com.paobing.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user_info where id = #{id}")
    public User getById(Integer id);
}
