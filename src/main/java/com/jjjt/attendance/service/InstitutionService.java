package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.InstitutionDao;
import com.jjjt.attendance.entity.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InstitutionService implements InstitutionDao {
    @Autowired
    private InstitutionDao institutionDao;

    //增加制度
    @Override
    public int InsertInstitution(Map map) {
        return institutionDao.InsertInstitution(map);
    }

    //删除制度
    @Override
    public int DeleteInstitution(Map map) {
        return institutionDao.DeleteInstitution(map);
    }

    //分页查询制度
    @Override
    public List<Institution> FindInstitution(Map map) {
        return institutionDao.FindInstitution(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return institutionDao.Total(map);
    }
}
