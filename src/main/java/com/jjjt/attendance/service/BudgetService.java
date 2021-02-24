package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.BudgetDao;
import com.jjjt.attendance.entity.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BudgetService implements BudgetDao {
    @Autowired
    private BudgetDao budgetDao;

    //增加收支明细
    @Override
    public int InsertBudget(Map map) {
        return budgetDao.InsertBudget(map);
    }

    //删除收支明细
    @Override
    public int DeleteBudget(Map map) {
        return budgetDao.DeleteBudget(map);
    }

    //修改收支明细
    @Override
    public int UpdateBudget(Map map) {
        return budgetDao.UpdateBudget(map);
    }

    //分页模糊查询收支明细
    @Override
    public List<Budget> FindBudget(Map map) {
        return budgetDao.FindBudget(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return budgetDao.Total(map);
    }

    //根据id查询收支明细
    @Override
    public Budget FindBudgetById(Map map) {
        return budgetDao.FindBudgetById(map);
    }
}
