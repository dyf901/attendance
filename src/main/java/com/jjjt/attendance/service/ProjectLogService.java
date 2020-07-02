package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ProjectLogDao;
import com.jjjt.attendance.entity.ProjectLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProjectLogService implements ProjectLogDao {
    @Autowired
    private ProjectLogDao projectLogDao;

    //增加项目日志
    @Override
    public int InsertProjectLog(Map map) {
        return projectLogDao.InsertProjectLog(map);
    }

    //删除项目日志
    @Override
    public int DeleteProjectLog(Map map) {
        return projectLogDao.DeleteProjectLog(map);
    }

    //修改项目日志
    @Override
    public int UpdateProjectLog(Map map) {
        return projectLogDao.UpdateProjectLog(map);
    }

    //查询项目日志
    @Override
    public List<ProjectLog> FindProjectLog(Map map) {
        return projectLogDao.FindProjectLog(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return projectLogDao.Total(map);
    }

    //查看个人项目日志
    @Override
    public List<ProjectLog> FindProjectLogByProjectId(Map map) {
        return projectLogDao.FindProjectLogByProjectId(map);
    }
}
