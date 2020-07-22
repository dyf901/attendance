package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface StaffTaskDao {
    //增加员工任务关系
    int InsertStaffTask(Map map);

    //根据staff_id查询对应关系
    List<Integer> FindStaffTask(Map map);

    //统计总数
    long Total(Map map);
}
