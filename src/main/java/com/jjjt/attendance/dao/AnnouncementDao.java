package com.jjjt.attendance.dao;

import com.jjjt.attendance.entity.Announcement;

import java.util.List;
import java.util.Map;

public interface AnnouncementDao {
    //发布公告
    int InsertAnnouncement(Map map);

    //删除公告
    int DeleteAnnouncement(Map map);

    //查询公告
    List<Announcement> FindAnnouncement(Map map);

    //统计总数
    long Total(Map map);
}
