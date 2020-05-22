package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.ExamineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamineService implements ExamineDao {
    @Autowired
    private ExamineDao examineDao;

}
