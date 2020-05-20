package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.RegistrationRecordDao;
import com.jjjt.attendance.entity.RegistrationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegistrationRecordService implements RegistrationRecordDao {
    @Autowired
    private RegistrationRecordDao registrationRecordDao;

    @Override
    public int InsertRegistrationRecord(Map map) {
        return registrationRecordDao.InsertRegistrationRecord(map);
    }

    @Override
    public List<RegistrationRecord> FindRegistrationRecordByStaffId(Map map) {
        return registrationRecordDao.FindRegistrationRecordByStaffId(map);
    }
}
