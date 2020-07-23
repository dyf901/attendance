package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Project", description = "项目表对象")
public class Project {
    @ApiModelProperty(value = "公告id", name = "id")
    private int id;

    @ApiModelProperty(value = "客户id", name = "items_id")
    private int items_id;

    @ApiModelProperty(value = "集团id",name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "客户名称", name = "items_name")
    private String items_name;

    @ApiModelProperty(value = "项目名称", name = "project_name")
    private String project_name;

    @ApiModelProperty(value = "项目负责人id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "负责人姓名", name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "项目开工时间", name = "start_time")
    private String start_time;

    @ApiModelProperty(value = "项目开工时间戳", name = "start_timeC")
    private long start_timeC;

    @ApiModelProperty(value = "项目完工时间", name = "end_time")
    private String end_time;

    @ApiModelProperty(value = "项目完工时间戳", name = "end_timeC")
    private long end_timeC;

    @ApiModelProperty(value = "项目款", name = "amount")
    private double amount;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "上传时间戳", name = "uptimeC")
    private long uptimeC;

    public Project(){
        super();
    }

    public Project(int id, int items_id, int conglomerate_id, String items_name, String project_name, int staff_id, String staff_name, String start_time, long start_timeC, String end_time, long end_timeC, double amount, String uptime, long uptimeC) {
        this.id = id;
        this.items_id = items_id;
        this.conglomerate_id = conglomerate_id;
        this.items_name = items_name;
        this.project_name = project_name;
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.start_time = start_time;
        this.start_timeC = start_timeC;
        this.end_time = end_time;
        this.end_timeC = end_timeC;
        this.amount = amount;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConglomerate_id() {
        return conglomerate_id;
    }

    public void setConglomerate_id(int conglomerate_id) {
        this.conglomerate_id = conglomerate_id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public String getItems_name() {
        return items_name;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public long getStart_timeC() {
        return start_timeC;
    }

    public void setStart_timeC(long start_timeC) {
        this.start_timeC = start_timeC;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public long getEnd_timeC() {
        return end_timeC;
    }

    public void setEnd_timeC(long end_timeC) {
        this.end_timeC = end_timeC;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public long getUptimeC() {
        return uptimeC;
    }

    public void setUptimeC(long uptimeC) {
        this.uptimeC = uptimeC;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", items_id=" + items_id +
                ", conglomerate_id=" + conglomerate_id +
                ", items_name='" + items_name + '\'' +
                ", project_name='" + project_name + '\'' +
                ", staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", start_timeC=" + start_timeC +
                ", end_time='" + end_time + '\'' +
                ", end_timeC=" + end_timeC +
                ", amount=" + amount +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                '}';
    }
}
