package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ExamineDao;
import com.jjjt.attendance.entity.Examine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExamineService implements ExamineDao {
    @Autowired
    private ExamineDao examineDao;

    //新建审批
    @Override
    public int InsertExamine(Map map) {
        return examineDao.InsertExamine(map);
    }

    //删除审批
    @Override
    public int DeleteExamine(Map map) {
        return examineDao.DeleteExamine(map);
    }

    //分页查询审批信息
    @Override
    public List<Examine> FindExamine(Map map) {
        return examineDao.FindExamine(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return examineDao.Total(map);
    }

    //查询个人审批记录
    @Override
    public List<Examine> FindExamineByStaffId(Map map) {
        return examineDao.FindExamineByStaffId(map);
    }

    //统计个人审批总数
    @Override
    public long TotalByStaffId(Map map) {
        return examineDao.TotalByStaffId(map);
    }

    //审核通过
    @Override
    public int UpdateStateT(Map map) {
        return examineDao.UpdateStateT(map);
    }

    //审核未通过
    @Override
    public int UpdateStateW(Map map) {
        return examineDao.UpdateStateW(map);
    }

    //根据id查询审批信息
    @Override
    public Examine FindExamineById(Map map) {
        return examineDao.FindExamineById(map);
    }

    //根据id查询审批信息(App)
    @Override
    public Examine FindExamineByIdApp(int id) {
        return examineDao.FindExamineByIdApp(id);
    }
}
