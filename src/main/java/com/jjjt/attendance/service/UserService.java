package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.UserDao;
import com.jjjt.attendance.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService implements UserDao {
    @Autowired
    private UserDao userDao;//用户dao

    //根据username查询用户信息
    @Override
    public User FindUserByUserName(Map map) {
        return userDao.FindUserByUserName(map);
    }
}
