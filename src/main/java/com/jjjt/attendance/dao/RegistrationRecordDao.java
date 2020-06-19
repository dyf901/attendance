package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.RegistrationRecord;

import java.util.List;
import java.util.Map;

public interface RegistrationRecordDao {
    //增加打卡记录
    int InsertRegistrationRecord(Map map);

    //查找个人指定时间的记录
    List<RegistrationRecord> FindRegistrationRecordByStaffId(Map map);

    //查找全部指定时间的记录
    List<RegistrationRecord> FindRegistrationRecordAll(Map map);
}
