package com.jjjt.attendance.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.jjjt.attendance.util.ShenPiSmsUtils.sendSms;

@Api(description = "短信发送测试接口")
@RestController
@RequestMapping("Sms")
@CrossOrigin
public class SmsTest {
    @ApiOperation(value = "SmsTest",notes = "")
    @PostMapping("/Send")
    public String Send(@RequestBody Map map) throws ClientException {
        System.out.println("map:"+map);
        String telephone = (String) map.get("telephone");
        String name = (String) map.get("name");
        String type = (String) map.get("type");
        SendSmsResponse sendSmsResponse = sendSms(telephone,name,type);
        if (sendSmsResponse.getCode().equals("OK")) {
            return "已发送";
        } else if (sendSmsResponse.getCode().equals("isv.MOBILE_NUMBER_ILLEGAL")) {
            return "无效号码";
        } else {
            return "未知错误";
        }
    }
}
