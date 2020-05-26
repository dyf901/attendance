package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Position;
import com.jjjt.attendance.service.PositionService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(description = "职务接口")
@RestController
@RequestMapping("Position")
@CrossOrigin
public class PositionController {
    @Autowired
    private PositionService positionService;

    @ApiOperation(value = "增加职务",notes = "")
    @PostMapping("/InsertPosition")
    public boolean InsertPosition(@RequestBody Map map){
        return positionService.InsertPosition(map)==1;
    }

    @ApiOperation(value = "删除职务",notes = "")
    @PostMapping("/DeletePosition")
    public boolean DeletePosition(@RequestBody Map map){
        return positionService.DeletePosition(map)==1;
    }

    @ApiOperation(value = "查询职务",notes = "")
    @PostMapping("/FindPosition")
    public Page FindPosition(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(positionService.Total(map));
        page.setItems(positionService.FindPosition(map));
        return page;
    }

    @ApiOperation(value = "下拉框查询职务",notes = "")
    @PostMapping("/SelectPosition")
    public List<Position> SelectPosition(@RequestBody Map map){
        return positionService.SelectPosition(map);
    }
}
