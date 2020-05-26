package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Position;

import java.util.List;
import java.util.Map;

public interface PositionDao {
    //增加职务
    int InsertPosition(Map map);

    //删除职务
    int DeletePosition(Map map);

    //分页查询职务
    List<Position> FindPosition(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询职务
    List<Position> SelectPosition(Map map);
}
