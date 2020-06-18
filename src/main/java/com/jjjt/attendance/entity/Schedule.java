package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Schedule", description = "跟进计划表对象")
public class Schedule {
    @ApiModelProperty(value = "公告id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "项目id", name = "items_id")
    private int items_id;

    @ApiModelProperty(value = "项目名称", name = "items_name")
    private String items_name;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "员工姓名", name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "上传时间(包括审批时间,报销时间)", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "添加时间戳", name = "uptimeC")
    private Long uptimeC;

    @ApiModelProperty(value = "负责人", name = "principal")
    private String principal;

    @ApiModelProperty(value = "跟进内容", name = "content")
    private String content;

    @ApiModelProperty(value = "跟进状态", name = "schedule_type")
    private String schedule_type;

    public Schedule(){
        super();
    }

    public Schedule(int id, int conglomerate_id, String conglomerate_name, int items_id, String items_name, int staff_id, String staff_name, String uptime, Long uptimeC, String principal, String content, String schedule_type) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
        this.items_id = items_id;
        this.items_name = items_name;
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
        this.principal = principal;
        this.content = content;
        this.schedule_type = schedule_type;
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

    public String getConglomerate_name() {
        return conglomerate_name;
    }

    public void setConglomerate_name(String conglomerate_name) {
        this.conglomerate_name = conglomerate_name;
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

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public Long getUptimeC() {
        return uptimeC;
    }

    public void setUptimeC(Long uptimeC) {
        this.uptimeC = uptimeC;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSchedule_type() {
        return schedule_type;
    }

    public void setSchedule_type(String schedule_type) {
        this.schedule_type = schedule_type;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", items_id=" + items_id +
                ", items_name='" + items_name + '\'' +
                ", staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                ", principal='" + principal + '\'' +
                ", content='" + content + '\'' +
                ", schedule_type='" + schedule_type + '\'' +
                '}';
    }
}
