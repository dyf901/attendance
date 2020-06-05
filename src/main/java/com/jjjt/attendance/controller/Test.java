package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Registration;
import com.jjjt.attendance.service.RegistrationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "App登录", notes = "传参:staff_phone(员工手机号),password(密码)")
    @PostMapping("/test")
    public List<Registration> Test(@RequestBody Map map) {
        return registrationService.FindRegistration(map);
    }

}
