package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Client;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.ClientService;
import com.jjjt.attendance.service.StaffItemsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "联系人接口")
@RestController
@RequestMapping("Client")
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private StaffItemsService staffItemsService;

    @ApiOperation(value = "根据items_id查询联系人信息", notes = "")
    @PostMapping("/FindClientByItemsId")
    public List<Client> FindClientByItemsId(@RequestBody Map map) {
        return clientService.FindClientByItemsId(map);
    }

    @ApiOperation(value = "增加项目联系人", notes = "传参:client_name(联系人姓名),client_sex(性别),client_position(职务),client_department(所在部门),client_phone(联系电话),staff_id,items_id(客户id)")
    @PostMapping("/InsertClient")
    public JsonResult InsertClient(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = clientService.InsertClient(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("添加成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("添加失败!");
            return jsonResult;
        }
    }


}
