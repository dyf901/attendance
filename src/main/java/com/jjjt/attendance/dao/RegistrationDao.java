package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Registration;

import java.util.Map;

public interface RegistrationDao {
    //签到
    int InsertRegistration(Registration registration);

    //签退
    int UpdateRegistration(Registration registration);

    //根据id查询打卡信息
    Registration FindRegistrationById(int id);
}
