package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.BalanceDao;
import com.jjjt.attendance.entity.Balance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BalanceService implements BalanceDao {
    @Autowired
    private BalanceDao balanceDao;

    //增加支出申请单
    @Override
    public int InsertBalance(Map map) {
        return balanceDao.InsertBalance(map);
    }

    //删除支出申请单
    @Override
    public int DeleteBalance(Map map) {
        return balanceDao.DeleteBalance(map);
    }

    //查询支出申请单
    @Override
    public List<Balance> FindBalance(Map map) {
        return balanceDao.FindBalance(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return balanceDao.Total(map);
    }

    //根据id查询详细信息
    @Override
    public Balance FindBalanceById(Map map) {
        return balanceDao.FindBalanceById(map);
    }

    //导入收支明细
    @Override
    public List<Balance> SelectBalance(Map map) {
        return balanceDao.SelectBalance(map);
    }
}
