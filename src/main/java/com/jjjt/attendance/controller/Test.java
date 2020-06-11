package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Examine;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Log;
import com.jjjt.attendance.entity.Registration;
import com.jjjt.attendance.service.LogService;
import com.jjjt.attendance.service.RegistrationService;
import com.jjjt.attendance.service.StaffLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(description = "Test")
@RestController
@RequestMapping("Test")
@CrossOrigin
public class Test {
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private LogService logService;

    @Autowired
    private StaffLogService staffLogService;

    @ApiOperation(value = "App登录", notes = "传参:staff_phone(员工手机号),password(密码)")
    @PostMapping("/test")
    public List<Registration> Test(@RequestBody Map map) {
        return registrationService.FindRegistration(map);
    }

    @ApiOperation(value = "测试",notes = "")
    @PostMapping("/testm")
    public JsonResult testm(Log log) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();

        log.setUptime(time);
        log.setUptimeC(times);
        int s = logService.InsertLog(log);
        System.out.println("返回最近添加的日志id:"+log.getId());
        /*if (s == 1) {
            map.put("log_id",log.getId());
            staffLogService.InsertStaffLog(map);
            jsonResult.setCode(200);
            jsonResult.setMessage("上传成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("上传失败!");
            return jsonResult;
        }*/
        return jsonResult;
    }
}
