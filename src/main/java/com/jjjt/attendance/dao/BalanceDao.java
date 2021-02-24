package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Balance;

import java.util.List;
import java.util.Map;

public interface BalanceDao {
    //增加支出申请单
    int InsertBalance(Map map);

    //删除支出申请单
    int DeleteBalance(Map map);

    //查询支出申请单
    List<Balance> FindBalance(Map map);

    //统计总数
    long Total(Map map);

    //根据id查询详细信息
    Balance FindBalanceById(Map map);

    //导入收支明细
    List<Balance> SelectBalance(Map map);

}
