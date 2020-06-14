package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Institution;

import java.util.List;
import java.util.Map;

public interface InstitutionDao {
    //增加制度
    int InsertInstitution(Map map);

    //删除制度
    int DeleteInstitution(Map map);

    //分页查询制度
    List<Institution> FindInstitution(Map map);

    //统计总数
    long Total(Map map);
}
