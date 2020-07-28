package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface StaffProjectDao {
    //增加员工项目关系
    int InsertStaffProject(Map map);

    //根据staff_id查询对应关系
    List<Integer> FindStaffProject(Map map);

    //统计总数
    long Total(Map map);
}
