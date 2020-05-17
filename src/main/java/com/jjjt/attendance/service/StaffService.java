package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffDao;
import com.jjjt.attendance.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffService implements StaffDao {
    @Autowired
    private StaffDao staffDao;//员工

    //增加员工信息
    @Override
    public int InsertStaff(Map map) {
        return staffDao.InsertStaff(map);
    }

    //删除员工信息
    @Override
    public int DeleteStaff(Map map) {
        return staffDao.DeleteStaff(map);
    }

    //修改员工信息
    @Override
    public int UpdateStaff(Map map) {
        return staffDao.UpdateStaff(map);
    }

    //分页模糊查询员工信息
    @Override
    public List<Staff> FindStaff(Map map) {
        return staffDao.FindStaff(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return staffDao.Total(map);
    }

    //根据id查询员工信息
    @Override
    public Staff FindStaffById(Map map) {
        return staffDao.FindStaffById(map);
    }

    //根据staff_phone查询员工信息
    @Override
    public Staff FindStaffByStaffPhone(Map map) {
        return staffDao.FindStaffByStaffPhone(map);
    }

    //修改打卡状态
    @Override
    public int UpdateClockstatus() {
        return staffDao.UpdateClockstatus();
    }

    //手机修改员工信息
    @Override
    public int UpdateStaffApp(Map map) {
        return staffDao.UpdateStaffApp(map);
    }
}
