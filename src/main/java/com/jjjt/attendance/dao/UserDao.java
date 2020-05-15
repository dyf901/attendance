package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.User;

import java.util.Map;

public interface UserDao {
    //根据username查询用户信息
    User FindUserByUserName(Map map);
}
