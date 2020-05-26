package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.FeedbackDao;
import com.jjjt.attendance.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FeedbackService implements FeedbackDao {
    @Autowired
    private FeedbackDao feedbackDao;

    //新增反馈信息
    @Override
    public int InsertFeedback(Map map) {
        return feedbackDao.InsertFeedback(map);
    }

    //分页查询反馈信息
    @Override
    public List<Feedback> FindFeedback(Map map) {
        return feedbackDao.FindFeedback(map);
    }

    //统计总数
    @Override
    public long Total() {
        return feedbackDao.Total();
    }
}
