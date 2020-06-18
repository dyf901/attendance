package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Log;
import com.jjjt.attendance.service.LogService;
import com.jjjt.attendance.service.StaffLogService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "日志接口")
@RestController
@RequestMapping("Log")
@CrossOrigin
public class LogController {
    @Autowired
    private LogService logService;

    @Autowired
    private StaffLogService staffLogService;

    @ApiOperation(value = "添加日志", notes = "传参:staff_id(员工id),company_id(公司id),content(日志内容)")
    @PostMapping("/InsertLog")
    public JsonResult InsertLog(@RequestBody Map map) throws ParseException {
        System.out.println(map);
        JsonResult jsonResult = new JsonResult();
        Log log = new Log();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        log.setStaff_id((Integer) map.get("staff_id"));
        log.setCompany_id((Integer) map.get("company_id"));
        log.setConglomerate_id((Integer) map.get("conglomerate_id"));
        log.setContent((String) map.get("content"));
        log.setTomorrow_plan((String) map.get("tomorrow_plan"));
        log.setUptime(time);
        log.setUptimeC(times);
        int s = logService.InsertLog(log);
        System.out.println("返回最近添加的日志id:"+log.getId());
        if (s == 1) {
            String list= (String) map.get("list");
            JSONArray jsonArray = JSONArray.fromObject(list);
            for (int i=0;i<jsonArray.size();i++){
                System.out.println(jsonArray.get(i));
                map.put("log_id",log.getId());
                map.put("staff_idT",jsonArray.get(i));
                staffLogService.InsertStaffLog(map);
            }
            jsonResult.setCode(200);
            jsonResult.setMessage("上传成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("上传失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "分页模糊查询日志", notes = "")
    @PostMapping("/FindLog")
    public Page<T> FindLog(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        if (map.containsKey("start_time1") && map.containsKey("end_time1")) {
            String start_time = map.get("start_time1") + " 00:00:00";
            String end_time = map.get("end_time1") + " 23:59:59";
            map.put("start_time", start_time);
            map.put("end_time", end_time);
        } else {
            map.put("start_time", null);
            map.put("end_time", null);

        }
        page.setTotal(logService.Total(map));
        page.setItems(logService.FindLog(map));
        return page;
    }

    @ApiOperation(value = "查找个人日志", notes = "")
    @PostMapping("/FindLogByStaffId")
    public Page<T> FindLogByStaffId(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(logService.TotalStaff(map));
        page.setItems(logService.FindLogByStaffId(map));
        return page;
    }

    @ApiOperation(value = "根据id查询详细日志信息", notes = "传参:id(日志信息的id)")
    @PostMapping("/FindLogById")
    public Log FindLogById(@RequestBody Map map) {
        return logService.FindLogById(map);
    }

    @ApiOperation(value = "查询提交给我的日志信息", notes = "")
    @PostMapping("FindLogByIdY")
    public Page FindLogByIdY(@RequestBody Map map) {
        Page page = new Page();
        List<Integer> list = staffLogService.FindStaffLog(map);//根据staff_id查询对应的审批信息id
        System.out.println("list:" + list);
        List list1 = new ArrayList();
        for (Integer l : list) {
            map.put("id", l);
            System.out.println("详细信息:" + logService.FindLogByIdY(map));
            if(logService.FindLogByIdY(map)==null){

            }else {
                list1.add(logService.FindLogByIdY(map));
            }
        }
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffLogService.Total(map));
        page.setItems(list1);
        return page;
    }
}
