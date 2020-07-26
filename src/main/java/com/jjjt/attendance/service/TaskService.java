package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.TaskDao;
import com.jjjt.attendance.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TaskService implements TaskDao {
    @Autowired
    private TaskDao taskDao;

    //发布任务
    @Override
    public int InsertTask(Task task) {
        return taskDao.InsertTask(task);
    }

    //删除任务
    @Override
    public int DeleteTask(Map map) {
        return taskDao.DeleteTask(map);
    }

    //撤销任务
    @Override
    public int UpdateTaskState(Map map) {
        return taskDao.UpdateTaskState(map);
    }

    //完成任务
    @Override
    public int UpdateTaskStateW(Map map) {
        return taskDao.UpdateTaskStateW(map);
    }

    //审核通过
    @Override
    public int UpdateTaskT(Map map) {
        return taskDao.UpdateTaskT(map);
    }

    //审核未通过
    @Override
    public int UpdateTaskW(Map map) {
        return taskDao.UpdateTaskW(map);
    }

    //分页模糊查询任务
    @Override
    public List<Task> FindTask(Map map) {
        return taskDao.FindTask(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return taskDao.Total(map);
    }

    //查询我创建的任务App
    @Override
    public List<Task> FindTaskByCreatorId(Map map) {
        return taskDao.FindTaskByCreatorId(map);
    }

    //统计总数我创建的任务
    @Override
    public long TotalByCreatorId(Map map) {
        return taskDao.TotalByCreatorId(map);
    }

    //查询我负责的任务App
    @Override
    public List<Task> FindTaskByPrincipalId(Map map) {
        return taskDao.FindTaskByPrincipalId(map);
    }

    //统计总数我负责的任务
    @Override
    public long TotalByPrincipalId(Map map) {
        return taskDao.TotalByPrincipalId(map);
    }

    //根据id查询任务
    @Override
    public Task FindTaskById(Map map) {
        return taskDao.FindTaskById(map);
    }
}
