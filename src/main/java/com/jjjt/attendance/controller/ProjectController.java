package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Project;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.PositionPermissionService;
import com.jjjt.attendance.service.ProjectService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "项目接口")
@RestController
@RequestMapping("Project")
@CrossOrigin
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @Autowired
    private PositionPermissionService positionPermissionService;

    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "增加项目", notes = "传参:conglomerate_id(集团id),items_id(客户id),staff_id(负责人id),start_timeC(项目开工时间戳),end_timeC(项目完工时间戳),amount(项目款)")
    @PostMapping("/InsertProject")
    public JsonResult InsertProject(@RequestBody Map map) throws ParseException {
        System.out.println("增加项目传参:"+map);
        JsonResult jsonResult = new JsonResult();
        //获取当前时间和时间戳
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        map.put("uptime",time);
        map.put("uptimeC",times);

        //获取项目开工时间，开工时间戳，完工时间，完工时间戳
        long start_timeC = (long) map.get("start_timeC");
        long end_timeC = (long) map.get("end_timeC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(start_timeC);
        Date date1 = new Date(lt);
        long lts = new Long(end_timeC);
        Date date2 = new Date(lts);
        String start_time = simpleDateFormat.format(date1);
        String end_time = simpleDateFormat.format(date2);
        map.put("start_time",start_time);
        map.put("end_time",end_time);

        int i = projectService.InsertProject(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("签约成功！");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("签约失败！");
        }
        return jsonResult;
    }

    @ApiOperation(value = "删除项目",notes = "")
    @PostMapping("/DeleteProject")
    public JsonResult DeleteProject(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = projectService.DeleteProject(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("删除成功！");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("删除失败！");
        }
        return jsonResult;
    }

    @ApiOperation(value = "修改项目",notes = "")
    @PostMapping("/UpdateProject")
    public JsonResult UpdateProject(@RequestBody Map map) throws ParseException {
        System.out.println("修改参数:"+map);
        JsonResult jsonResult = new JsonResult();

        String start_time = (String) map.get("start_time");
        String end_time = (String) map.get("end_time");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        Date date = format.parse(start_time);
        Date date1 = format.parse(end_time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        long times1 = date1.getTime();
        map.put("start_timeC" , times);
        map.put("end_timeC" , times1);

        int i = projectService.UpdateProject(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功！");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败！");
        }
        return jsonResult;
    }

    @ApiOperation(value = "分页查询项目信息PC",notes = "")
    @PostMapping("/FindProject")
    public Page<Project> FindProject(@RequestBody Map map){
        Page<Project> page = new Page<Project>();
        if (map.containsKey("start1") && map.containsKey("end1")) {
            String start_time = map.get("start1") + " 00:00:00";
            String end_time = map.get("end1") + " 23:59:59";
            map.put("start", start_time);
            map.put("end", end_time);
        } else {
            map.put("start_time", null);
            map.put("end_time", null);

        }
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(projectService.Total(map));
        page.setItems(projectService.FindProject(map));
        return page;
    }

    @ApiOperation(value = "分页查询项目信息APP",notes = "传参:conglomerate_id(集团id),staff_id(负责人id),pageNo,pageSize")
    @PostMapping("/FindProjectByStaffId")
    public Page<Project> FindProjectByStaffId(@RequestBody Map map){
        Page<Project> page = new Page<Project>();
        System.out.println(map);
        map.put("id",map.get("staff_id"));
        Staff staff = staffService.FindStaffById(map);//获取用户信息查询职位id
        //System.out.println("staff:"+staff);
        map.put("position_id",staff.getPosition_id());
        //System.out.println(staff.getPosition_id());
        List<Integer> list = positionPermissionService.FindPositionPermissionByPositionId(map);//查询职位id对应的权限id集合
        if(list.size()>0){//判断集合是否为0
            for (Integer l : list) {//遍历
                //System.out.println("l:" + l);
                if(l==6) {//判断是否具有查看权限
                    page.setPageNo((Integer) map.get("pageNo"));
                    page.setPageSize((Integer) map.get("pageSize"));
                    page.setTotal(projectService.Total(map));
                    page.setItems(projectService.FindProject(map));
                }
            }
        }else {
            page.setPageNo((Integer) map.get("pageNo"));
            page.setPageSize((Integer) map.get("pageSize"));
            page.setTotal(projectService.TotalByStaffId(map));
            page.setItems(projectService.FindProjectByStaffId(map));
        }
        return page;
    }
}
