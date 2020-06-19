package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.RegistrationRecord;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.PositionPermissionService;
import com.jjjt.attendance.service.RegistrationRecordService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.TimeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Api(description = "app查看考勤记录")
@RestController
@RequestMapping("RegistrationRecord")
@CrossOrigin
public class RegistrationRecordController {
    @Autowired
    private RegistrationRecordService registrationRecordService;

    @Autowired
    private PositionPermissionService positionPermissionService;

    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "查找个人打卡记录", notes = "传参:staff_id(员工id,登录返回),timeC(要查询日期时间戳)")
    @PostMapping("/FindRegistrationRecordByStaffId")
    public List<RegistrationRecord> FindRegistrationRecordByStaffId(@RequestBody Map map) {
        System.out.println(map);
        TimeUtils timeUtils = new TimeUtils();
        String time = (String) map.get("timeC");
        System.out.println(timeUtils.toDate(time));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(timeUtils.toDate(time), formatter);
        System.out.println("Year: " + ldt.getYear());
        System.out.println("Month: " + ldt.getMonth().getValue());
        System.out.println("DayOfMonth: " + ldt.getDayOfMonth());
        map.put("Year", ldt.getYear());
        map.put("Month", ldt.getMonth().getValue());
        map.put("Day", ldt.getDayOfMonth());
        return registrationRecordService.FindRegistrationRecordByStaffId(map);
    }

    @ApiOperation(value = "查看全部打卡记录",notes = "传参:conglomerate_id,staff_id,timeC(要查询日期时间戳)")
    @PostMapping("/FindAll")
    public JsonResult FindAll(@RequestBody Map map){
        System.out.println(map);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(200);
        TimeUtils timeUtils = new TimeUtils();
        String time = (String) map.get("timeC");
        System.out.println(timeUtils.toDate(time));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(timeUtils.toDate(time), formatter);
        System.out.println("Year: " + ldt.getYear());
        System.out.println("Month: " + ldt.getMonth().getValue());
        System.out.println("DayOfMonth: " + ldt.getDayOfMonth());
        map.put("Year", ldt.getYear());
        map.put("Month", ldt.getMonth().getValue());
        map.put("Day", ldt.getDayOfMonth());
        map.put("id",map.get("staff_id"));
        Staff staff = staffService.FindStaffById(map);
        System.out.println("staff:"+staff);
        map.put("position_id",staff.getPosition_id());
        System.out.println(staff.getPosition_id());
        List<Integer> list = positionPermissionService.FindPositionPermissionByPositionId(map);
        if(list.size()>0){
            for (Integer l : list) {
                System.out.println("l:" + l);
                if(l==1) {
                    jsonResult.setCode(200);
                    jsonResult.setData(registrationRecordService.FindRegistrationRecordAll(map));
                }
            }
        }else {
            jsonResult.setCode(200);
            jsonResult.setMessage("未获得权限!");
        }
        return jsonResult;
    }
}
