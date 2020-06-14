package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffLogService implements StaffLogDao {
    @Autowired
    private StaffLogDao staffLogDao;

    //增加员工日志对应关系
    @Override
    public int InsertStaffLog(Map map) {
        return staffLogDao.InsertStaffLog(map);
    }

    //根据staff_id查询对应关系
    @Override
    public List<Integer> FindStaffLog(Map map) {
        return staffLogDao.FindStaffLog(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return staffLogDao.Total(map);
    }
}
