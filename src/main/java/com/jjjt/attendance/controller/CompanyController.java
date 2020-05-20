package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Company;
import com.jjjt.attendance.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "根据集团id查询公司信息" , notes = "")
    @PostMapping("/FindCompanyByConglomerateId")
    public List<Company> FindCompanyByConglomerateId(@RequestBody Map map){
        return companyService.FindCompanyByConglomerateId(map);
    }
}
