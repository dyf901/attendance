package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffExamineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffExamineService implements StaffExamineDao {
    @Autowired
    private StaffExamineDao staffExamineDao;

    //增加员工审批关联信息
    @Override
    public int InsertStaffExamine(Map map) {
        return staffExamineDao.InsertStaffExamine(map);
    }

    //根据staff_id查询审批id
    @Override
    public List<Integer> FindExamineId(Map map) {
        return staffExamineDao.FindExamineId(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return staffExamineDao.Total(map);
    }
}
