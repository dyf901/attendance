package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "StaffExamine", description = "员工审批关联表对象")
public class StaffExamine {
    @ApiModelProperty(value = "客户id", name = "id")
    private int id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "项目id", name = "examine_id")
    private int examine_id;

    @ApiModelProperty(value = "审批类型(审批,报销,出差,加班,请假)", name = "examine_type")
    private String examine_type;

    @ApiModelProperty(value = "上传时间",name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "审批状态", name = "state")
    private String state;

    public StaffExamine(){
        super();
    }

    public StaffExamine(int id, int staff_id, int examine_id, String examine_type, String uptime, String state) {
        this.id = id;
        this.staff_id = staff_id;
        this.examine_id = examine_id;
        this.examine_type = examine_type;
        this.uptime = uptime;
        this.state = state;
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

    public int getExamine_id() {
        return examine_id;
    }

    public void setExamine_id(int examine_id) {
        this.examine_id = examine_id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getExamine_type() {
        return examine_type;
    }

    public void setExamine_type(String examine_type) {
        this.examine_type = examine_type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", examine_id=" + examine_id +
                ", examine_type='" + examine_type + '\'' +
                ", uptime='" + uptime + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
