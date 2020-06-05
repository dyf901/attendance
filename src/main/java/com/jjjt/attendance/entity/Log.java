package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Log", description = "日志表对象")
public class Log {
    @ApiModelProperty(value = "审批id", name = "id")
    private int id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "公司id", name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "公司名称", name = "company_name")
    private String company_name;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

    @ApiModelProperty(value = "明日计划", notes = "")
    private String tomorrow_plan;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "上传时间戳", name = "uptimeC")
    private Long uptimeC;

    @ApiModelProperty(value = "员工名称", name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    public Log() {
        super();
    }

    public Log(int id, int staff_id, int company_id, String company_name, String content, String tomorrow_plan, String uptime, Long uptimeC, String staff_name, int conglomerate_id, String conglomerate_name) {
        this.id = id;
        this.staff_id = staff_id;
        this.company_id = company_id;
        this.company_name = company_name;
        this.content = content;
        this.tomorrow_plan = tomorrow_plan;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
        this.staff_name = staff_name;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
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

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getTomorrow_plan() {
        return tomorrow_plan;
    }

    public void setTomorrow_plan(String tomorrow_plan) {
        this.tomorrow_plan = tomorrow_plan;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", content='" + content + '\'' +
                ", tomorrow_plan='" + tomorrow_plan + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                ", staff_name='" + staff_name + '\'' +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                '}';
    }
}
