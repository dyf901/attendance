package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.ProjectLog;

import java.util.List;
import java.util.Map;

public interface ProjectLogDao {
    //增加项目日志
    int InsertProjectLog (Map map);

    //删除项目日志
    int DeleteProjectLog (Map map);

    //修改项目日志
    int UpdateProjectLog (Map map);

    //查询项目日志
    List<ProjectLog> FindProjectLog (Map map);

    //统计总数
    long Total(Map map);

    //查看个人项目日志
    List<ProjectLog> FindProjectLogByProjectId (Map map);
}
