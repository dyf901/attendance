package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Examine;

import java.util.List;
import java.util.Map;

public interface ExamineDao {
    //新建审批
    int InsertExamine(Map map);

    //删除审批
    int DeleteExamine(Map map);

    //分页查询审批信息
    List<Examine> FindExamine(Map map);

    //统计总数
    long Total(Map map);

    //查询个人审批记录
    List<Examine> FindExamineByStaffId(Map map);

    //统计个人审批总数
    long TotalByStaffId(Map map);

    //审核通过
    int UpdateStateT(Map map);

    //审核未通过
    int UpdateStateW(Map map);
}
