package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "App登录接口")
@RestController
@RequestMapping("AppLogin")
@CrossOrigin
public class AppLogin {
    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "App登录", notes = "传参:staff_phone(员工手机号),password(密码)")
    @PostMapping("/AppLogin")
    public JsonResult AppLogin(@RequestBody Map map) {

        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffByStaffPhone(map);
        if (staff != null) {
            if (staff.getPassword().equals(map.get("password"))) {
                jsonResult.setCode(200);
                jsonResult.setMessage("登录成功!");
                jsonResult.setData(staff);
                return jsonResult;

            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("密码错误,登录失败!");
                return jsonResult;
            }
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("账号不存在!");
            return jsonResult;
        }

    }
}
