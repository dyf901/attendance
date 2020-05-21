package com.jjjt.attendance.service;

import com.jjjt.attendance.dao.AnnouncementDao;
import com.jjjt.attendance.entity.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AnnouncementService implements AnnouncementDao {
    @Autowired
    private AnnouncementDao announcementDao;

    //发布公告
    @Override
    public int InsertAnnouncement(Map map) {
        return announcementDao.InsertAnnouncement(map);
    }

    //删除公告
    @Override
    public int DeleteAnnouncement(Map map) {
        return announcementDao.DeleteAnnouncement(map);
    }

    //查询公告
    @Override
    public List<Announcement> FindAnnouncement(Map map) {
        return announcementDao.FindAnnouncement(map);
    }

    //统计总数
    @Override
    public long Total(Map map) {
        return announcementDao.Total(map);
    }
}
