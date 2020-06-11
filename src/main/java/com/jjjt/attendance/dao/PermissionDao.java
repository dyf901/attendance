package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionDao {
    //增加权限类型
    int InsertPermission(Map map);

    //删除权限类型
    int DeletePermission(Map map);

    //查询权限类型
    List<Permission> FindPermission();

    //根据id查询权限类型
    Permission FindPermissionById(int id);

}
