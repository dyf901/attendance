package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.LogService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "日志接口")
@RestController
@RequestMapping("Log")
@CrossOrigin
public class LogController {
    @Autowired
    private LogService logService;

    @ApiOperation(value = "添加日志",notes = "传参:staff_id(员工id),company_id(公司id),content(日志内容)")
    @PostMapping("/InsertLog")
    public JsonResult InsertLog(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        map.put("uptimeC",times);
        map.put("uptime",time);
        int s = logService.InsertLog(map);
        if(s==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("上传成功!");
            return jsonResult;
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("上传失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value ="分页模糊查询日志",notes = "")
    @PostMapping("/FindLog")
    public Page<T> FindLog(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(logService.Total(map));
        page.setItems(logService.FindLog(map));
        return page;
    }
}
