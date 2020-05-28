package com.jjjt.attendance.dao;

import java.util.List;
import java.util.Map;

public interface StaffItemsDao {
    //增加关联信息
    int InsertStaffItems(Map map);

    //根据staff_id查询客户信息
    List<Long> FindItemsId(Map map);
}
