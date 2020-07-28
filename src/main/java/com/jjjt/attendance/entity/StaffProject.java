package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "StaffProject", description = "员工项目表对象")
public class StaffProject {
    @ApiModelProperty(value = "任务员工id", name = "id")
    private int id;

    @ApiModelProperty(value = "项目id", name = "project_id")
    private int project_id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    public StaffProject(){super();}

    public StaffProject(int id, int project_id, int staff_id, String uptime) {
        this.id = id;
        this.project_id = project_id;
        this.staff_id = staff_id;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
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
                ", project_id=" + project_id +
                ", staff_id=" + staff_id +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
