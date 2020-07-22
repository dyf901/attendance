package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffTaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffTaskService implements StaffTaskDao {
    @Autowired
    private StaffTaskDao staffTaskDao;

    //增加员工任务关系
    @Override
    public int InsertStaffTask(Map map) {
        return staffTaskDao.InsertStaffTask(map);
    }

    //根据staff_id查询对应关系
    @Override
    public List<Integer> FindStaffTask(Map map) {
        return staffTaskDao.FindStaffTask(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return staffTaskDao.Total(map);
    }
}
