package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Budget;

import java.util.List;
import java.util.Map;

public interface BudgetDao {
    //增加收支明细
    int InsertBudget(Map map);

    //删除收支明细
    int DeleteBudget(Map map);

    //修改收支明细
    int UpdateBudget(Map map);

    //分页模糊查询收支明细
    List<Budget> FindBudget(Map map);

    //统计总数
    long Total(Map map);

    //根据id查询收支明细
    Budget FindBudgetById(Map map);
}
