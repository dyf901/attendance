package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.LogDao;
import com.jjjt.attendance.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LogService implements LogDao {
    @Autowired
    private LogDao logDao;

    //添加日志
    @Override
    public int InsertLog(Log log) {
        return logDao.InsertLog(log);
    }

    //分页模糊查询
    @Override
    public List<Log> FindLog(Map map) {
        return logDao.FindLog(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return logDao.Total(map);
    }

    //查找个人日志
    @Override
    public List<Log> FindLogByStaffId(Map map) {
        return logDao.FindLogByStaffId(map);
    }

    //统计个人总数
    @Override
    public long TotalStaff(Map map) {
        return logDao.TotalStaff(map);
    }

    //根据id查询日志的详细信息
    @Override
    public Log FindLogById(Map map) {
        return logDao.FindLogById(map);
    }

    //根据id查询日志的详细信息(App)
    @Override
    public Log FindLogByIdY(Map map) {
        return logDao.FindLogByIdY(map);
    }

    //根据id删除日志信息
    @Override
    public int DeleteLog(Map map) {
        return logDao.DeleteLog(map);
    }
}
