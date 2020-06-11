package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Permission;
import com.jjjt.attendance.service.PermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "权限接口")
@RestController
@RequestMapping("Permission")
@CrossOrigin
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @ApiOperation(value = "查询所有权限",notes = "")
    @PostMapping("/FindPermission")
    public List<Permission> FindPermission(){
        return permissionService.FindPermission();
    }


}
