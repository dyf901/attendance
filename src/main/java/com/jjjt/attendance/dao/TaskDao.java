package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Task;

import java.util.List;
import java.util.Map;

public interface TaskDao {
    //发布任务
    int InsertTask(Task task);

    //删除任务
    int DeleteTask(Map map);

    //修改任务
    int UpdateTaskState(Map map);

    //完成任务
    int UpdateTaskStateW(Map map);

    //审核通过
    int UpdateTaskT(Map map);

    //审核未通过
    int UpdateTaskW(Map map);

    //分页模糊查询任务
    List<Task> FindTask(Map map);

    //统计总数
    long Total(Map map);

    //查询我创建的任务App
    List<Task> FindTaskByCreatorId(Map map);

    //统计总数我创建的任务
    long TotalByCreatorId(Map map);

    //查询我负责的任务App
    List<Task> FindTaskByPrincipalId(Map map);

    //统计总数我负责的任务
    long TotalByPrincipalId(Map map);

    //根据id查询任务
    Task FindTaskById(Map map);
}
