package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface StaffLogDao {
    //增加员工日志对应关系
    int InsertStaffLog(Map map);

    //根据staff_id查询对应关系
    List<Integer> FindStaffLog(Map map);
}
