package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Items;

import java.util.List;
import java.util.Map;

public interface ItemsDao {
    //增加客户
    int InsertItems(Items items);

    //删除客户
    int DeleteItems(Map map);

    //修改客户信息
    int UpdateItems(Map map);

    //分页模糊查询客户信息
    List<Items> FindItems(Map map);

    //统计总数
    long Total(Map map);

    //App查询客户信息
    List<Items> FindItemsApp(Map map);

    //根据id查询客户信息
    Items FindItemsById(int id);
}
