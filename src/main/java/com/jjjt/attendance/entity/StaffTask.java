package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "StaffTask", description = "员工任务表对象")
public class StaffTask {
    @ApiModelProperty(value = "任务员工id", name = "id")
    private int id;

    @ApiModelProperty(value = "任务id", name = "task_id")
    private int task_id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    public StaffTask(){
        super();
    }

    public StaffTask(int id, int task_id, int staff_id, String uptime) {
        this.id = id;
        this.task_id = task_id;
        this.staff_id = staff_id;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", task_id=" + task_id +
                ", staff_id=" + staff_id +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
