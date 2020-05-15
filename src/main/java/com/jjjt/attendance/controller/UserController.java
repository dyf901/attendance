package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.User;
import com.jjjt.attendance.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "用户接口接口")
@RestController
@RequestMapping("User")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "PC登录" , notes = "")
    @PostMapping("/Login")
    public JsonResult DeleteRiskshow(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        User user = userService.FindUserByUserName(map);
        if(user==null){
            jsonResult.setCode(200);
            jsonResult.setMessage("账号不存在!");
            return jsonResult;
        }else {
            if(user.getPassword().equals(map.get("password"))){
                jsonResult.setCode(200);
                jsonResult.setData(user);
                jsonResult.setMessage("登录成功!");
                return jsonResult;
            }else {
                jsonResult.setCode(200);
                jsonResult.setMessage("密码错误,登录失败!");
                return jsonResult;
            }
        }
    }
}
