package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Balance;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.BalanceService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "支出申请单接口")
@RestController
@RequestMapping("Balance")
@CrossOrigin
public class BalanceController {
    @Autowired
    private BalanceService balanceService;

    @ApiOperation(value = "增加支出申请单",notes = "")
    @PostMapping("/InsertBalance")
    public JsonResult InsertBalance(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = balanceService.InsertBalance(map);
        if(i==1){
            jsonResult.setMessage("增加成功!");
            jsonResult.setCode(200);
            return jsonResult;
        }else {
            jsonResult.setMessage("增加失败!");
            jsonResult.setCode(20006);
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除支出申请单",notes = "")
    @PostMapping("/DeleteBalance")
    public JsonResult DeleteBalance(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = balanceService.DeleteBalance(map);
        if(i==1){
            jsonResult.setMessage("删除成功!");
            jsonResult.setCode(200);
            return jsonResult;
        }else {
            jsonResult.setMessage("删除失败!");
            jsonResult.setCode(20006);
            return jsonResult;
        }
    }

    @ApiOperation(value = "分页模糊查询支出申请单",notes = "")
    @PostMapping("/FindBalance")
    public Page FindBalance(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(balanceService.Total(map));
        page.setItems(balanceService.FindBalance(map));
        return page;
    }

    @ApiOperation(value = "导入收支明细",notes = "")
    @PostMapping("/SelectBalance")
    public List<Balance> SelectBalance(@RequestBody Map map){
        return balanceService.SelectBalance(map);
    }
}
