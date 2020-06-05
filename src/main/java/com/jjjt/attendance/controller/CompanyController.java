package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Company;
import com.jjjt.attendance.service.CompanyService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "公司接口")
@RestController
@RequestMapping("Company")
@CrossOrigin
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @ApiOperation(value = "增加公司信息", notes = "")
    @PostMapping("/InsertCompany")
    public boolean InsertCompany(@RequestBody Map map) {
        return companyService.InsertCompany(map) == 1;
    }

    @ApiOperation(value = "删除公司信息", notes = "")
    @PostMapping("/DeleteCompany")
    public boolean DeleteCompany(@RequestBody Map map) {
        return companyService.DeleteCompany(map) == 1;
    }

    @ApiOperation(value = "修改公司信息", notes = "")
    @PostMapping("/UpdateCompany")
    public boolean UpdateCompany(@RequestBody Map map) {
        return companyService.UpdateCompany(map) == 1;
    }

    @ApiOperation(value = "根据集团id查询公司信息", notes = "")
    @PostMapping("/FindCompanyByConglomerateId")
    public List<Company> FindCompanyByConglomerateId(@RequestBody Map map) {
        return companyService.FindCompanyByConglomerateId(map);
    }

    @ApiOperation(value = "修改公司上下班时间", notes = "")
    @PostMapping("/UpdateTime")
    public boolean UpdateTime(@RequestBody Map map) {
        return companyService.UpdateTime(map) == 1;
    }

    @ApiOperation(value = "分页查询公司信息", notes = "")
    @PostMapping("/FindCompany")
    public Page FindCompany(@RequestBody Map map) {
        Page page = new Page<>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(companyService.Total(map));
        page.setItems(companyService.FindCompany(map));
        return page;
    }
}
