package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface StaffExamineDao {
    //增加员工审批关联表
    int InsertStaffExamine(Map map);

    //根据staff_id查询审批信息
    List<Integer> FindExamineId(Map map);

}
