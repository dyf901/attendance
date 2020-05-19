package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Registration;

import java.util.List;
import java.util.Map;

public interface RegistrationDao {
    //签到
    int InsertRegistration(Registration registration);

    //签退
    int UpdateRegistration(Registration registration);

    //根据id查询打卡信息
    Registration FindRegistrationById(int id);

    //分页模糊查询打卡信息
    List<Registration> FindRegistration(Map map);

    //统计总数
    long Total(Map map);

    //导出打卡记录
    List<Registration> ExportExcel(Map map);
}
