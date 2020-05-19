package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.RegistrationDao;
import com.jjjt.attendance.entity.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegistrationService implements RegistrationDao {
    @Autowired
    private RegistrationDao registrationDao;

    //签到
    @Override
    public int InsertRegistration(Registration registration) {
        return registrationDao.InsertRegistration(registration);
    }

    //签退
    @Override
    public int UpdateRegistration(Registration registration) {
        return registrationDao.UpdateRegistration(registration);
    }

    //根据id查询打卡信息
    @Override
    public Registration FindRegistrationById(int id) {
        return registrationDao.FindRegistrationById(id);
    }

    //分页模糊查询打卡信息
    @Override
    public List<Registration> FindRegistration(Map map) {
        return registrationDao.FindRegistration(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return registrationDao.Total(map);
    }

    //导出打卡记录
    @Override
    public List<Registration> ExportExcel(Map map) {
        return registrationDao.ExportExcel(map);
    }
}
