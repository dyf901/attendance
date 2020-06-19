package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Schedule;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.PositionPermissionService;
import com.jjjt.attendance.service.ScheduleService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "跟进信息接口")
@RestController
@RequestMapping("Schedule")
@CrossOrigin
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private PositionPermissionService positionPermissionService;

    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "增加跟进信息",notes = "传参:`conglomerate_id`(集团id), `items_id`(客户id), `staff_id`(员工id), `principal`(负责人), `content`(跟进内容), `schedule_type`(跟进状态)")
    @PostMapping("/InsertSchedule")
    public JsonResult InsertSchedule(@RequestBody Map map) throws ParseException {
        System.out.println(map);
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
        int i = scheduleService.InsertSchedule(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("上传成功!");
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("上传失败!");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除跟进信息",notes = "传参:id")
    @PostMapping("/DeleteSchedule")
    public boolean DeleteSchedule(@RequestBody Map map){
        return scheduleService.DeleteSchedule(map)==1;
    }

    @ApiOperation(value = "修改跟进信息",notes = "传参:id,principal(负责人),content(内容),schedule_type(跟进状态)")
    @PostMapping("/UpdateSchedule")
    public boolean UpdateSchedule(@RequestBody Map map){
        return scheduleService.UpdateSchedule(map)==1;
    }

    @ApiOperation(value = "分页查询跟进信息",notes = "传参:pageNo,pageSize,conglomerate_id")
    @PostMapping("/FindSchedule")
    public Page FindSchedule(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(scheduleService.Total(map));
        page.setItems(scheduleService.FindSchedule(map));
        return page;
    }

    @ApiOperation(value = "分页查询个人跟进信息",notes = "传参:conglomerate_id,staff_id")
    @PostMapping("/FindScheduleByStaffId")
    public JsonResult FindScheduleByStaffId(@RequestBody Map map){
        System.out.println(map);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(200);
        map.put("id",map.get("staff_id"));
        Staff staff = staffService.FindStaffById(map);
        System.out.println("staff:"+staff);
        map.put("position_id",staff.getPosition_id());
        System.out.println(staff.getPosition_id());
        List<Integer> list = positionPermissionService.FindPositionPermissionByPositionId(map);
        if(list.size()>0){
            for (Integer l : list) {
                System.out.println("l:" + l);
                if(l==3) {
                    System.out.println("a:"+scheduleService.FindScheduleAll(map));
                    jsonResult.setData(scheduleService.FindScheduleAll(map));
                }
            }
        }else{
            System.out.println("b"+scheduleService.FindScheduleByStaffId(map));
            jsonResult.setData(scheduleService.FindScheduleByStaffId(map));
        }

        return jsonResult;
    }
}
