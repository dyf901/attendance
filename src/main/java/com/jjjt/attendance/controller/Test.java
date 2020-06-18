package com.jjjt.attendance.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.jjjt.attendance.entity.Examine;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Log;
import com.jjjt.attendance.entity.Registration;
import com.jjjt.attendance.service.LogService;
import com.jjjt.attendance.service.RegistrationService;
import com.jjjt.attendance.service.StaffLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
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
    public JsonResult testm(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        String s= (String) map.get("list");
        JSONArray jsonArray = JSONArray.fromObject(s);

        for (int i = 0; i < jsonArray.size(); i++) {
            int a = (int) jsonArray.get(i);
            System.out.println(a);
        }


        return jsonResult;
    }
}
