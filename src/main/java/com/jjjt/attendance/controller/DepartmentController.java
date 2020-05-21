package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Department;
import com.jjjt.attendance.service.DepartmentService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "部门接口")
@RestController
@RequestMapping("Department")
@CrossOrigin
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "增加部门",notes = "")
    @PostMapping("/InsertDepartment")
    public boolean InsertDepartment(@RequestBody Map map){
        return departmentService.InsertDepartment(map)==1;
    }

    @ApiOperation(value = "删除部门",notes = "")
    @PostMapping("/DeleteDepartment")
    public boolean DeleteDepartment(@RequestBody Map map){
        return departmentService.DeleteDepartment(map)==1;
    }

    @ApiOperation(value = "修改部门",notes = "")
    @PostMapping("/UpdateDepartment")
    public boolean UpdateDepartment(@RequestBody Map map){
        return departmentService.UpdateDepartment(map)==1;
    }

    @ApiOperation(value = "分页模糊查询",notes = "")
    @PostMapping("/FindDepartment")
    public Page<Department> FindDepartment(@RequestBody Map map){
        Page<Department> page = new Page<Department>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(departmentService.Total(map));
        page.setItems(departmentService.FindDepartment(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询部门信息",notes = "")
    @PostMapping("/SelectDepartment")
    public List<Department> SelectDepartment(@RequestBody Map map){
        System.out.println(map);
        return departmentService.SelectDepartment(map);
    }
}
