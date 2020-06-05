package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Announcement;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.AnnouncementService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "公告接口")
@RestController
@RequestMapping("Announcement")
@CrossOrigin
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;

    @ApiOperation(value = "发布公告", notes = "")
    @PostMapping("/InsertAnnouncement")
    public boolean InsertAnnouncement(@RequestBody Map map) {
        return announcementService.InsertAnnouncement(map) == 1;
    }

    @ApiOperation(value = "删除公告", notes = "")
    @PostMapping("/DeleteAnnouncement")
    public boolean DeleteAnnouncement(@RequestBody Map map) {
        return announcementService.DeleteAnnouncement(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询公告", notes = "")
    @PostMapping("/FindAnnouncement")
    public Page FindAnnouncement(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(announcementService.Total(map));
        page.setItems(announcementService.FindAnnouncement(map));
        return page;
    }

    @ApiOperation(value = "修改阅读量", notes = "传参:id(公告id)")
    @PostMapping("/UpdateReadCount")
    public JsonResult UpdateReadCount(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        Announcement announcement = announcementService.FindAnnouncementById(map);
        map.put("read_count", announcement.getRead_count());
        int i = announcementService.UpdateReadCount(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
            return jsonResult;
        }
    }
}
