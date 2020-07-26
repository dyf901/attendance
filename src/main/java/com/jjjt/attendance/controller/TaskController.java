package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.entity.Task;
import com.jjjt.attendance.service.PositionPermissionService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.service.StaffTaskService;
import com.jjjt.attendance.service.TaskService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Api(description = "任务接口")
@RestController
@RequestMapping("Task")
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;

    @Autowired
    private StaffTaskService staffTaskService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private PositionPermissionService positionPermissionService;

    //{"conglomerate_id":1,
    // "creator_id":11,
    // "principal_id":11,
    // "participant":"[11,4,5]",
    // "task_title":"阿斯顿",
    // "task_describe":"阿萨德",
    // "start_img":"",
    // "end_timeC":1595754633000,
    // "degree":"紧急"}

    @ApiOperation(value = "查看权限",notes = "传参:staff_id(员工id)")
    @PostMapping("/FindPermission")
    public JsonResult FindPermission(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        Staff staff = staffService.FindStaffById(map);
        System.out.println("staff:"+staff);
        map.put("position_id",staff.getPosition_id());
        System.out.println(staff.getPosition_id());
        List<Integer> list = positionPermissionService.FindPositionPermissionByPositionId(map);
        if(list.size()>0){
            for (Integer l : list) {
                System.out.println("l:" + l);
                if(l==7) {
                    jsonResult.setCode(200);
                    jsonResult.setMessage("已获得权限");
                }
            }
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("未获得权限!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "发布任务", notes = "传参:conglomerate_id(集团id),creator_id(创建人id),principal_id(负责人id),participant(参与人id数组),task_title(任务标题),task_describe(任务描述),start_img(任务图片),end_timeC(结束时间戳),degree(紧急程度)")
    @PostMapping("/InsertTask")
    public JsonResult InsertTask(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        Task task = new Task();
        long end_timeC = (long) map.get("end_timeC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lts = new Long(end_timeC);
        Date date2 = new Date(lts);
        String end_time = simpleDateFormat.format(date2);//根据时间戳获取时间

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();//获取当前时间,时间戳

        int taskday= (int) ((date2.getTime()-date.getTime()+1000000)/(60*60*24*1000));//获取任务间隔时间

        //把数据塞进实体类中
        task.setConglomerate_id((Integer) map.get("conglomerate_id"));
        task.setCreator_id((Integer) map.get("creator_id"));
        task.setPrincipal_id((Integer) map.get("principal_id"));
        task.setParticipant((String) map.get("participant"));
        task.setTask_title((String) map.get("task_title"));
        task.setTask_describe((String) map.get("task_describe"));
        task.setStart_img((String) map.get("start_img"));
        task.setUptime(time);
        task.setUptimeC(times);
        task.setEnd_time(end_time);
        task.setEnd_timeC(end_timeC);
        task.setDegree((String) map.get("degree"));
        task.setTaskday(taskday);

        int i = taskService.InsertTask(task);
        if(i==1){
            String list= (String) map.get("participant");
            JSONArray jsonArray = JSONArray.fromObject(list);
            for (int s=0;s<jsonArray.size();s++){
                map.put("task_id",task.getId());
                map.put("staff_id",jsonArray.get(s));
                map.put("uptime",time);
                staffTaskService.InsertStaffTask(map);
            }
            jsonResult.setCode(200);
            jsonResult.setMessage("任务发布成功!");
            return jsonResult;
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("任务发布失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "删除任务", notes = "传参:id(任务id)")
    @PostMapping("/DeleteTask")
    public JsonResult DeleteTask(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = taskService.DeleteTask(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("任务删除成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("任务删除失败!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "撤销任务", notes = "传参:id(任务id)")
    @PostMapping("/UpdateTaskState")
    public JsonResult UpdateTaskState(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = taskService.UpdateTaskState(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("任务撤销成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("任务撤销失败!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "完成任务", notes = "传参:id(任务id),task_summarize(任务总结),task_reason(申请理由(申请结束)),end_img(结束图片)")
    @PostMapping("/UpdateTaskStateW")
    public JsonResult UpdateTaskStateW(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = taskService.UpdateTaskStateW(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("完成任务成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("完成任务失败!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "审核通过", notes = "传参:id(任务id),check(通过原因)")
    @PostMapping("/UpdateTaskT")
    public JsonResult UpdateTaskT(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = taskService.UpdateTaskT(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("审核通过成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("审核通过失败!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "审核未通过", notes = "传参:id(任务id),check(未通过原因)")
    @PostMapping("/UpdateTaskW")
    public JsonResult UpdateTaskW(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = taskService.UpdateTaskW(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("审核未通过成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("审核未通过失败!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "分页模糊查询任务", notes = "传参:conglomerate_id(集团id),pageNo,pageSize")
        @PostMapping("/FindTask")
        public Page<Task> FindTask(@RequestBody Map map){
            Page<Task> page = new Page<Task>();
            page.setPageNo((Integer) map.get("pageNo"));
            page.setPageSize((Integer) map.get("pageSize"));
            page.setTotal(taskService.Total(map));
            page.setItems(taskService.FindTask(map));
            return page;
    }

    @ApiOperation(value = "查询我派发的任务App", notes = "传参:creator_id(创建人id),pageNo,pageSize")
    @PostMapping("/FindTaskByCreatorId")
    public Page<Task> FindTaskByCreatorId(@RequestBody Map map){
        Page<Task> page = new Page<Task>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(taskService.TotalByCreatorId(map));
        page.setItems(taskService.FindTaskByCreatorId(map));
        return page;
    }

    @ApiOperation(value = "查询我负责的任务App", notes = "传参:principal_id(负责人id),pageNo,pageSize")
    @PostMapping("/FindTaskByPrincipalId")
    public Page<Task> FindTaskByPrincipalId(@RequestBody Map map){
        Page<Task> page = new Page<Task>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(taskService.TotalByPrincipalId(map));
        page.setItems(taskService.FindTaskByPrincipalId(map));
        return page;
    }

    @ApiOperation(value = "查询我参与的任务",notes = "传参:staff_id(员工id),pageNo,pageSize")
    @PostMapping("/FindTaskByParticipant")
    public Page<Task> FindTaskByParticipant(@RequestBody Map map){
        Page<Task> page = new Page<Task>();
        List<Integer> list = staffTaskService.FindStaffTask(map);
        System.out.println("list:" + list);
        List list1 = new ArrayList();
        for (Integer l : list) {
            map.put("id", l);
            System.out.println("详细信息:" + staffTaskService.FindStaffTask(map));
            if(staffTaskService.FindStaffTask(map)==null){

            }else {
                list1.add(staffTaskService.FindStaffTask(map));
            }
        }
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffTaskService.Total(map));
        page.setItems(list1);
        return page;
    }
}
