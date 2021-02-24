package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.BudgetService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "收支明细接口")
@RestController
@RequestMapping("Budget")
@CrossOrigin
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @ApiOperation(value = "增加收支明细",notes = "")
    @PostMapping("/InsertBudget")
    public JsonResult InsertBudget(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = budgetService.InsertBudget(map);
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

    @ApiOperation(value = "删除收支明细",notes = "")
    @PostMapping("/DeleteBudget")
    public JsonResult DeleteBudget(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = budgetService.DeleteBudget(map);
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

    @ApiOperation(value = "修改收支明细",notes = "")
    @PostMapping("/UpdateBudget")
    public JsonResult UpdateBudget(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = budgetService.UpdateBudget(map);
        if(i==1){
            jsonResult.setMessage("修改成功!");
            jsonResult.setCode(200);
            return jsonResult;
        }else {
            jsonResult.setMessage("修改失败!");
            jsonResult.setCode(20006);
            return jsonResult;
        }
    }

    @ApiOperation(value = "分页模糊查询收支明细",notes = "")
    @PostMapping("/FindBudget")
    public Page FindBudget(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(budgetService.Total(map));
        page.setItems(budgetService.FindBudget(map));
        return page;
    }
}
