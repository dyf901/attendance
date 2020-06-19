package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Schedule;

import java.util.List;
import java.util.Map;

public interface ScheduleDao {
    //增加跟进信息
    int InsertSchedule(Map map);

    //删除跟进信息
    int DeleteSchedule(Map map);

    //修改跟进信息
    int UpdateSchedule(Map map);

    //分页模糊查询跟进信息
    List<Schedule> FindSchedule(Map map);

    //统计总数
    long Total(Map map);

    //查询个人跟进信息
    List<Schedule> FindScheduleByStaffId(Map map);

    //统计个人总数
    long TotalByStaffId(Map map);

    //查询跟进信息
    List<Schedule> FindScheduleAll(Map map);
}
