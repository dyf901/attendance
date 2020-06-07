package com.jjjt.attendance.controller;

import com.jjjt.attendance.service.PermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "权限接口")
@RestController
@RequestMapping("Permission")
@CrossOrigin
public class PermissionController {
    @Autowired
    private PermissionService permissionService;


}
