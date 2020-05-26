package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.PositionDao;
import com.jjjt.attendance.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PositionService implements PositionDao {
    @Autowired
    private PositionDao positionDao;

    //增加职务
    @Override
    public int InsertPosition(Map map) {
        return positionDao.InsertPosition(map);
    }

    //删除职务
    @Override
    public int DeletePosition(Map map) {
        return positionDao.DeletePosition(map);
    }

    //分页查询职务
    @Override
    public List<Position> FindPosition(Map map) {
        return positionDao.FindPosition(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return positionDao.Total(map);
    }

    //下拉框查询职务信息
    @Override
    public List<Position> SelectPosition(Map map) {
        return positionDao.SelectPosition(map);
    }
}
