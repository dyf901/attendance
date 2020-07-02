package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.ProjectLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "公告接口")
@RestController
@RequestMapping("ProjectLog")
@CrossOrigin
public class ProjectLogController {
    @Autowired
    private ProjectLogService projectLogService;

    @ApiOperation(value = "增加项目日志",notes = "传参:conglomerate_id(集团id),project_id(项目id),content(日志内容),list(图片数组)")
    @PostMapping("/InsertProjectLog")
    public JsonResult InsertProjectLog(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        map.put("uptime",time);
        map.put("uptimes",times);
        map.put("url",map.get("list"));
        int i = projectLogService.InsertProjectLog(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("增加成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("增加失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除项目日志",notes = "")
    @PostMapping("/DeleteProjectLog")
    public JsonResult DeleteProjectLog(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = projectLogService.DeleteProjectLog(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败!");
        }
        return jsonResult;
    }
}
