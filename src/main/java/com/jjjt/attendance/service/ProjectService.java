package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ProjectDao;
import com.jjjt.attendance.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProjectService implements ProjectDao {
    @Autowired
    private ProjectDao projectDao;

    //增加项目
    @Override
    public int InsertProject(Project project) {
        return projectDao.InsertProject(project);
    }

    //删除项目
    @Override
    public int DeleteProject(Map map) {
        return projectDao.DeleteProject(map);
    }

    //修改项目
    @Override
    public int UpdateProject(Map map) {
        return projectDao.UpdateProject(map);
    }

    //分页模糊查询项目信息
    @Override
    public List<Project> FindProject(Map map) {
        return projectDao.FindProject(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return projectDao.Total(map);
    }

    //分页查询个人项目信息
    @Override
    public List<Project> FindProjectByStaffId(Map map) {
        return projectDao.FindProjectByStaffId(map);
    }

    //统计总数_个人
    @Override
    public long TotalByStaffId(Map map) {
        return projectDao.TotalByStaffId(map);
    }

    //查询个人项目信息
    @Override
    public List<Project> FindProjectByStaffIdB(Map map) {
        return projectDao.FindProjectByStaffIdB(map);
    }

    //查询项目信息
    @Override
    public List<Project> FindProjectB(Map map) {
        return projectDao.FindProjectB(map);
    }

    //根据id查询项目信息
    @Override
    public Project FindProjectById(Map map) {
        return projectDao.FindProjectById(map);
    }
}
