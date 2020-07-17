package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TaskService implements TaskDao {
    @Autowired
    private TaskDao taskDao;

    //发布任务
    @Override
    public int InsertTask(Map map) {
        return taskDao.InsertTask(map);
    }
}
