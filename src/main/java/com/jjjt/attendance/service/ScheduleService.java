package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ScheduleDao;
import com.jjjt.attendance.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScheduleService implements ScheduleDao {
    @Autowired
    private ScheduleDao scheduleDao;

    //增加跟进信息
    @Override
    public int InsertSchedule(Map map) {
        return scheduleDao.InsertSchedule(map);
    }

    //删除跟进信息
    @Override
    public int DeleteSchedule(Map map) {
        return scheduleDao.DeleteSchedule(map);
    }

    //修改跟进信息
    @Override
    public int UpdateSchedule(Map map) {
        return scheduleDao.UpdateSchedule(map);
    }

    //分页模糊查询跟进信息
    @Override
    public List<Schedule> FindSchedule(Map map) {
        return scheduleDao.FindSchedule(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return scheduleDao.Total(map);
    }

    //查询个人跟进信息
    @Override
    public List<Schedule> FindScheduleByStaffId(Map map) {
        return scheduleDao.FindScheduleByStaffId(map);
    }

    //统计个人总数
    @Override
    public long TotalByStaffId(Map map) {
        return scheduleDao.TotalByStaffId(map);
    }
}
