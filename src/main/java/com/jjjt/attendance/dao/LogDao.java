package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Log;

import java.util.List;
import java.util.Map;

public interface LogDao {
    //添加日志
    int InsertLog(Log log);

    //分页模糊查询日志
    List<Log> FindLog(Map map);

    //统计总数
    long Total(Map map);

    //查找个人日志
    List<Log> FindLogByStaffId(Map map);

    //统计个人总数
    long TotalStaff(Map map);

    //根据id查询日志的详细信息
    Log FindLogById(Map map);

    //根据id查询日志的详细信息(App)
    Log FindLogByIdY(Map map);

    //根据id删除日志信息
    int DeleteLog(Map map);
}
