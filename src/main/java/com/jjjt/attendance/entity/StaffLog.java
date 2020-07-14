package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "StaffLog", description = "员工日志关联表对象")
public class StaffLog {
    @ApiModelProperty(value = "客户id", name = "id")
    private int id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "日志id", name = "log_id")
    private int log_id;

    @ApiModelProperty(value = "上传时间",name = "uptime")
    private String uptime;

    public StaffLog(){
        super();
    }

    public StaffLog(int id, int staff_id, int log_id, String uptime) {
        this.id = id;
        this.staff_id = staff_id;
        this.log_id = log_id;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
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
                ", staff_id=" + staff_id +
                ", log_id=" + log_id +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
