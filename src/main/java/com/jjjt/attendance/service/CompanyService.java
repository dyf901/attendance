package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.CompanyDao;
import com.jjjt.attendance.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CompanyService implements CompanyDao {
    @Autowired
    private CompanyDao companyDao;

    @Override
    public Company FindCompanyById(Map map) {
        return companyDao.FindCompanyById(map);
    }
}
