package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.CompanyDao;
import com.jjjt.attendance.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CompanyService implements CompanyDao {
    @Autowired
    private CompanyDao companyDao;

    //增加公司信息
    @Override
    public int InsertCompany(Map map) {
        return companyDao.InsertCompany(map);
    }

    //删除公司信息
    @Override
    public int DeleteCompany(Map map) {
        return companyDao.DeleteCompany(map);
    }

    //修改公司信息
    @Override
    public int UpdateCompany(Map map) {
        return companyDao.UpdateCompany(map);
    }

    //分页查询公司信息
    @Override
    public List<Company> FindCompany(Map map) {
        return companyDao.FindCompany(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return companyDao.Total(map);
    }

    //根据company_id查询公司信息
    @Override
    public Company FindCompanyById(Map map) {
        return companyDao.FindCompanyById(map);
    }

    //根据conglomerate_id查询公司信息
    @Override
    public List<Company> FindCompanyByConglomerateId(Map map) {
        return companyDao.FindCompanyByConglomerateId(map);
    }

    //修改公司人数
    @Override
    public int UpdatePersonCount(Map map) {
        return companyDao.UpdatePersonCount(map);
    }

    //修改上下班时间
    @Override
    public int UpdateTime(Map map) {
        return companyDao.UpdateTime(map);
    }
}
