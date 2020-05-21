package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentDao {
    //增加部门
    int InsertDepartment(Map map);

    //删除部门
    int DeleteDepartment(Map map);

    //修改部门信息
    int UpdateDepartment(Map map);

    //查询部门信息
    List<Department> FindDepartment(Map map);

    //统计总数
    long Total(Map map);

    //下拉框查询部门信息
    List<Department> SelectDepartment(Map map);

    //根据id查询部门信息
    Department FindDepartmentById(Map map);

    //修改部门人数
    int UpdatePersonCount(Map map);
}
