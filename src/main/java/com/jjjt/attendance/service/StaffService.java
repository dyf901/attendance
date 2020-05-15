package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.StaffDao;
import com.jjjt.attendance.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffService implements StaffDao {
    @Autowired
    private StaffDao staffDao;//员工

    //
    @Override
    public int InsertStaff(Map map) {
        return 0;
    }

    //
    @Override
    public int DeleteStaff(Map map) {
        return 0;
    }

    //
    @Override
    public int UpdateStaff(Map map) {
        return 0;
    }

    //
    @Override
    public List<Staff> FindStaff(Map map) {
        return null;
    }

    //
    @Override
    public long Total(Map map) {
        return 0;
    }

    //
    @Override
    public Staff FindStaffById(Map map) {
        return null;
    }

    //
    @Override
    public Staff FindStaffByStaffPhone(Map map) {
        return null;
    }

    //
    @Override
    public int UpdateClockstatus() {
        return 0;
    }

    //
    @Override
    public int UpdateStaffApp(Map map) {
        return 0;
    }
}
