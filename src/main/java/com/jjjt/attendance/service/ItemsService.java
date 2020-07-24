package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ItemsDao;
import com.jjjt.attendance.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItemsService implements ItemsDao {
    @Autowired
    private ItemsDao itemsDao;

    //增加客户
    @Override
    public int InsertItems(Items items) {
        return itemsDao.InsertItems(items);
    }

    //删除客户
    @Override
    public int DeleteItems(Map map) {
        return itemsDao.DeleteItems(map);
    }

    //修改客户信息
    @Override
    public int UpdateItems(Map map) {
        return itemsDao.UpdateItems(map);
    }

    //分页模糊查询客户信息
    @Override
    public List<Items> FindItems(Map map) {
        return itemsDao.FindItems(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return itemsDao.Total(map);
    }

    //App查询客户信息
    @Override
    public List<Items> FindItemsApp(Map map) {
        return itemsDao.FindItemsApp(map);
    }

    //根据id查询员工信息
    @Override
    public Items FindItemsById(int id) {
        return itemsDao.FindItemsById(id);
    }

    //修改客户状态
    @Override
    public int UpdateItemsByState(Map map) {
        return itemsDao.UpdateItemsByState(map);
    }

    //修改客户签约人
    @Override
    public int UpdateItemsByStaffId(Map map) {
        return itemsDao.UpdateItemsByStaffId(map);
    }

    //App查询客户信息B
    @Override
    public List<Items> FindItemsAppB(Map map) {
        return itemsDao.FindItemsAppB(map);
    }

    //根据id查询客户信息B
    @Override
    public Items FindItemsByIdB(int id) {
        return itemsDao.FindItemsByIdB(id);
    }
}
