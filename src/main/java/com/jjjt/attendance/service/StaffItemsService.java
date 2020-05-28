package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffItemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffItemsService implements StaffItemsDao {
    @Autowired
    private StaffItemsDao staffItemsDao;

    @Override
    public int InsertStaffItems(Map map) {
        return staffItemsDao.InsertStaffItems(map);
    }

    @Override
    public List<Long> FindItemsId(Map map) {
        return staffItemsDao.FindItemsId(map);
    }
}
