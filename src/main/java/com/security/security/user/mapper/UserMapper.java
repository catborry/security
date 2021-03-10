package com.security.security.user.mapper;

import com.security.security.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper{
    @Select(value = "select * from sys_user where user_name=#{userName}")
    public User getUser(String userName);
}
