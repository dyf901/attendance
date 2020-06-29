package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.PositionPermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PositionPermissionService implements PositionPermissionDao {
    @Autowired
    private PositionPermissionDao positionPermissionDao;

    //增加职务权限对应关系
    @Override
    public int InsertPositionPermission(Map map) {
        return positionPermissionDao.InsertPositionPermission(map);
    }

    //根据position_id查询对应权限
    @Override
    public List<Integer> FindPositionPermissionByPositionId(Map map) {
        return positionPermissionDao.FindPositionPermissionByPositionId(map);
    }

    //删除position_id对应的权限
    @Override
    public int DeletePositionPermission(Map map) {
        return positionPermissionDao.DeletePositionPermission(map);
    }
}
