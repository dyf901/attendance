package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Feedback;

import java.util.List;
import java.util.Map;

public interface FeedbackDao {
    //新增反馈信息
    int InsertFeedback(Map map);

    //分页查询反馈信息
    List<Feedback> FindFeedback(Map map);

    //统计总数
    long Total();


}
