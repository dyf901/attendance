package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.PermissionDao;
import com.jjjt.attendance.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PermissionService implements PermissionDao {
    @Autowired
    private PermissionDao permissionDao;

    //增加权限类型
    @Override
    public int InsertPermission(Map map) {
        return permissionDao.InsertPermission(map);
    }

    //删除权限类型
    @Override
    public int DeletePermission(Map map) {
        return permissionDao.DeletePermission(map);
    }

    //查询权限类型
    @Override
    public List<Permission> FindPermission() {
        return permissionDao.FindPermission();
    }

    //根据id查询权限类型
    @Override
    public Permission FindPermissionById(int id) {
        return permissionDao.FindPermissionById(id);
    }
}
