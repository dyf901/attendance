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

    //修改全部打卡状态
    @Override
    public int UpdateClockstatus() {
        return staffDao.UpdateClockstatus();
    }

    //根据id修改打卡状态
    @Override
    public int UpdateClockstatusById(Map map) {
        return staffDao.UpdateClockstatusById(map);
    }

    //根据id修改打卡状态为2
    @Override
    public int UpdateClockstatusByIdT(Map map) {
        return staffDao.UpdateClockstatusByIdT(map);
    }

    //手机修改员工信息
    @Override
    public int UpdateStaffApp(Map map) {
        return staffDao.UpdateStaffApp(map);
    }

    //查询打卡状态
    @Override
    public Staff FindClockstatus(Map map) {
        return staffDao.FindClockstatus(map);
    }

    //App查询所有员工
    @Override
    public List<Staff> FindAllApp(Map map) {
        return staffDao.FindAllApp(map);
    }

    //修改员工转正时间
    @Override
    public int UpdatePromotionTime(Map map) {
        return staffDao.UpdatePromotionTime(map);
    }

    //离职
    @Override
    public int UpdateState(Map map) {
        return staffDao.UpdateState(map);
    }

    //审批短信信息查询
    @Override
    public Staff FindStaffByIdS(Map map) {
        return staffDao.FindStaffByIdS(map);
    }
}
