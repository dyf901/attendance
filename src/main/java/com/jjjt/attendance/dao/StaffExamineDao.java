package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface StaffExamineDao {
    //增加员工审批关联表
    int InsertStaffExamine(Map map);

    //根据staff_id查询审批信息
    List<Integer> FindExamineId(Map map);

    //统计总数
    long Total(Map map);

    //删除关联信息
    int DeleteStaffExamine(Map map);

    //修改状态_通过
    int UpdateStaffExamineByStateT(Map map);

    //修改状态_通过
    int UpdateStaffExamineByStateW(Map map);

}
