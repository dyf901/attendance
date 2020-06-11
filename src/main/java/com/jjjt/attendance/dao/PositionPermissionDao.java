package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface PositionPermissionDao {
    //增加职务权限对应关系
    int InsertPositionPermission(Map map);

    //根据position_id查询对应权限
    List<Integer> FindPositionPermissionByPositionId(Map map);

}
