package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Examine;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.ExamineService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "审批接口")
@RestController
@RequestMapping("Examine")
@CrossOrigin
public class ExamineController {
    @Autowired
    private ExamineService examineService;

    @ApiOperation(value = "新建审批", notes = "")
    @PostMapping("/InsertExamine")
    public JsonResult InsertExamine(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        map.put("uptimeC", times);
        map.put("uptime", time);
        if (map.get("examine_type").equals("出差")) {
            long outtimeC = (long) map.get("outtimeC");
            long intimeC = (long) map.get("intimeC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(outtimeC);
            Date date1 = new Date(lt);
            long lts = new Long(intimeC);
            Date date2 = new Date(lts);
            String outtime = simpleDateFormat.format(date1);
            String intime = simpleDateFormat.format(date2);
            map.put("outtime", outtime);
            map.put("intime", intime);
        } else if (map.get("examine_type").equals("请假")) {
            long start_timeC = (long) map.get("start_timeC");
            long end_timeC = (long) map.get("end_timeC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(start_timeC);
            Date date1 = new Date(lt);
            long lts = new Long(end_timeC);
            Date date2 = new Date(lts);
            String start_time = simpleDateFormat.format(date1);
            String end_time = simpleDateFormat.format(date2);
            map.put("start_time", start_time);
            map.put("end_time", end_time);
        }
        int i = examineService.InsertExamine(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("提交成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("提交失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除审批", notes = "")
    @PostMapping("/DeleteExamine")
    public boolean DeleteExamine(@RequestBody Map map) {
        return examineService.DeleteExamine(map) == 1;
    }

    @ApiOperation(value = "分页查询审批信息", notes = "")
    @PostMapping("/FindExamine")
    public Page FindExamine(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examineService.Total(map));
        page.setItems(examineService.FindExamine(map));
        return page;
    }

    @ApiOperation(value = "查询个人审批记录", notes = "传参:staff_id(登录返回id),pageNo,pageSize")
    @PostMapping("/FindExamineByStaffId")
    public Page FindExamineByStaffId(@RequestBody Map map) {
        System.out.println("map" + map);
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examineService.TotalByStaffId(map));
        page.setItems(examineService.FindExamineByStaffId(map));
        return page;
    }

    @ApiOperation(value = "审核通过", notes = "")
    @PostMapping("/UpdateStateT")
    public boolean UpdateStateT(@RequestBody Map map) {
        return examineService.UpdateStateT(map) == 1;
    }

    @ApiOperation(value = "审核未通过", notes = "")
    @PostMapping("/UpdateStateW")
    public boolean UpdateStateW(@RequestBody Map map) {
        return examineService.UpdateStateW(map) == 1;
    }

    @ApiOperation(value = "根据id查询详细审批信息", notes = "传参:id(每条记录对应的id)")
    @PostMapping("/FindExamineById")
    public Examine FindExamineById(@RequestBody Map map) {
        return examineService.FindExamineById(map);
    }
}
