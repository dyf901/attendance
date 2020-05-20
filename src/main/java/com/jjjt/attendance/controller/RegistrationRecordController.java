package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.RegistrationRecord;
import com.jjjt.attendance.service.RegistrationRecordService;
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

    @ApiOperation(value = "查找个人打卡记录",notes = "传参:staff_id(员工id,登录返回),timeC(要查询日期时间戳)")
    @PostMapping("/FindRegistrationRecordByStaffId")
    public List<RegistrationRecord> FindRegistrationRecordByStaffId(@RequestBody Map map){
        TimeUtils timeUtils = new TimeUtils();
        String time= (String) map.get("timeC");
        System.out.println(timeUtils.toDate(time));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(timeUtils.toDate(time), formatter);
        System.out.println("Year: " + ldt.getYear());
        System.out.println("Month: " + ldt.getMonth().getValue());
        System.out.println("DayOfMonth: " + ldt.getDayOfMonth());
        map.put("Year",ldt.getYear());
        map.put("Month",ldt.getMonth().getValue());
        return registrationRecordService.FindRegistrationRecordByStaffId(map);
    }
}
