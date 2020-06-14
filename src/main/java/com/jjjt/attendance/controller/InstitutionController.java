package com.jjjt.attendance.controller;

import com.jjjt.attendance.service.InstitutionService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "制度接口")
@RestController
@RequestMapping("Institution")
@CrossOrigin
public class InstitutionController {
    @Autowired
    private InstitutionService institutionService;

    @ApiOperation(value = "增加制度", notes = "传参:`conglomerate_id`, `title`(标题), `content`(内容)")
    @PostMapping("/InsertInstitution")
    public boolean InsertInstitution(@RequestBody Map map) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        map.put("uptime",time);
        map.put("uptimeC",times);
        return institutionService.InsertInstitution(map) == 1;
    }

    @ApiOperation(value = "删除制度", notes = "传参:制度id")
    @PostMapping("/DeleteInstitution")
    public boolean DeleteInstitution(@RequestBody Map map) {
        return institutionService.DeleteInstitution(map) == 1;
    }

    @ApiOperation(value = "分页查询制度", notes = "传参:pageNo,pageSize,conglomerate_id")
    @PostMapping("/FindInstitution")
    public Page FindInstitution(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(institutionService.Total(map));
        page.setItems(institutionService.FindInstitution(map));
        return page;
    }
}
