package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffProjectService implements StaffProjectDao {
    @Autowired
    private StaffProjectDao staffProjectDao;

    //增加员工项目关系
    @Override
    public int InsertStaffProject(Map map) {
        return staffProjectDao.InsertStaffProject(map);
    }

    //根据staff_id查询对应关系
    @Override
    public List<Integer> FindStaffProject(Map map) {
        return staffProjectDao.FindStaffProject(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return staffProjectDao.Total(map);
    }
}
