package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Staff;

import java.util.List;
import java.util.Map;

public interface StaffDao {
    //增加员工信息
    int InsertStaff(Map map);

    //删除员工信息
    int DeleteStaff(Map map);

    //修改员工信息
    int UpdateStaff(Map map);

    //分页模糊查询员工信息
    List<Staff> FindStaff(Map map);

    //统计总数
    long Total(Map map);

    //根据id查询员工信息
    Staff FindStaffById(Map map);

    //根据staff_phone查询员工信息
    Staff FindStaffByStaffPhone(Map map);

    //修改全部员工打卡状态
    int UpdateClockstatus();

    //根据id修改员工状态
    int UpdateClockstatusById(Map map);

    //根据id修改员工状态为2
    int UpdateClockstatusByIdT(Map map);

    //手机修改员工信息
    int UpdateStaffApp(Map map);

    //查询打卡状态
    Staff FindClockstatus(Map map);

    //App查询所有员工
    List<Staff> FindAllApp(Map map);

    //修改员工转正时间
    int UpdatePromotionTime(Map map);

    //离职
    int UpdateState(Map map);

    //审批短信信息查询
    Staff FindStaffByIdS(Map map);
}
