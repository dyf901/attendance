package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Project;

import java.util.List;
import java.util.Map;

public interface ProjectDao {
    //增加项目
    int InsertProject (Map map);

    //删除项目
    int DeleteProject (Map map);

    //修改项目
    int UpdateProject (Map map);

    //分页模糊查询项目信息
    List<Project> FindProject (Map map);

    //统计总数
    long Total (Map map);

    //分页查询个人项目信息
    List<Project> FindProjectByStaffId (Map map);

    //统计总数_个人
    long TotalByStaffId (Map map);

    //查询个人项目信息
    List<Project> FindProjectByStaffIdB (Map map);

    //查询项目信息
    List<Project> FindProjectB (Map map);
}
