package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Task;
import com.jjjt.attendance.service.TaskService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "任务接口")
@RestController
@RequestMapping("Task")
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;

    @ApiOperation(value = "发布任务", notes = "")
    @PostMapping("/InsertTask")
    public JsonResult InsertTask(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = taskService.InsertTask(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("任务发布成功!");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("任务发布失败!");
        }

        return jsonResult;
    }

    @ApiOperation(value = "删除任务", notes = "")
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

    @ApiOperation(value = "撤销任务", notes = "")
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

    @ApiOperation(value = "完成任务", notes = "")
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

    @ApiOperation(value = "审核通过", notes = "")
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

    @ApiOperation(value = "审核未通过", notes = "")
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

    @ApiOperation(value = "分页模糊查询任务", notes = "")
        @PostMapping("/FindTask")
        public Page<Task> FindTask(@RequestBody Map map){
            Page<Task> page = new Page<Task>();
            page.setPageNo((Integer) map.get("pageNo"));
            page.setPageSize((Integer) map.get("pageSize"));
            page.setTotal(taskService.Total(map));
            page.setItems(taskService.FindTask(map));
            return page;
    }

    @ApiOperation(value = "查询我创建的任务App", notes = "")
    @PostMapping("/FindTaskByCreatorId")
    public Page<Task> FindTaskByCreatorId(@RequestBody Map map){
        Page<Task> page = new Page<Task>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(taskService.TotalByCreatorId(map));
        page.setItems(taskService.FindTaskByCreatorId(map));
        return page;
    }

    @ApiOperation(value = "查询我负责的任务App", notes = "")
    @PostMapping("/FindTaskByPrincipalId")
    public Page<Task> FindTaskByPrincipalId(@RequestBody Map map){
        Page<Task> page = new Page<Task>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(taskService.TotalByPrincipalId(map));
        page.setItems(taskService.FindTaskByPrincipalId(map));
        return page;
    }
}
