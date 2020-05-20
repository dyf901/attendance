package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Company;

import java.util.List;
import java.util.Map;

public interface CompanyDao {
    //增加公司信息
    int InsertCompany(Map map);

    //删除公司信息
    int DeleteCompany(Map map);

    //修改公司信息
    int UpdateCompany(Map map);

    //根据company_id查询公司信息
    Company FindCompanyById(Map map);

    //根据conglomerate_id查询公司信息
    List<Company> FindCompanyByConglomerateId(Map map);
}
