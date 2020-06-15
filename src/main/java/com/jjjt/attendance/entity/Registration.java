package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Registration", description = "打卡表对象")
public class Registration {
    @ApiModelProperty(value = "打卡id", name = "id")
    private int id;

    @ApiModelProperty(value = "公司id", name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "星期", name = "week")
    private String week;

    @ApiModelProperty(value = "签到时间", name = "in_time")
    private String in_time;

    @ApiModelProperty(value = "签到地址", name = "in_address")
    private String in_address;

    @ApiModelProperty(value = "签退时间", name = "out_time")
    private String out_time;

    @ApiModelProperty(value = "签退地址", name = "out_address")
    private String out_address;

    @ApiModelProperty(value = "签到备注", name = "remarkD")
    private String remarkD;

    @ApiModelProperty(value = "签退备注", name = "remarkT")
    private String remarkT;

    @ApiModelProperty(value = "加班时长", name = "overtime_hours")
    private int overtime_hours;

    @ApiModelProperty(value = "状态", name = "stateD")
    private String stateD;

    @ApiModelProperty(value = "状态", name = "stateD")
    private String stateT;

    @ApiModelProperty(value = "员工姓名", name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "部门名称", name = "department_name")
    private String department_name;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "公司名称", name = "company_name")
    private String company_name;

    @ApiModelProperty(value = "签到图片", name = "urlD")
    private String urlD;

    @ApiModelProperty(value = "签退图片", name = "urlT")
    private String urlT;

    public Registration() {
        super();
    }

    public Registration(int id, int company_id, int staff_id, String week, String in_time, String in_address, String out_time, String out_address, String remarkD, String remarkT, int overtime_hours, String stateD, String stateT, String staff_name, String department_name, int conglomerate_id, String conglomerate_name, String company_name, String urlD, String urlT) {
        this.id = id;
        this.company_id = company_id;
        this.staff_id = staff_id;
        this.week = week;
        this.in_time = in_time;
        this.in_address = in_address;
        this.out_time = out_time;
        this.out_address = out_address;
        this.remarkD = remarkD;
        this.remarkT = remarkT;
        this.overtime_hours = overtime_hours;
        this.stateD = stateD;
        this.stateT = stateT;
        this.staff_name = staff_name;
        this.department_name = department_name;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
        this.company_name = company_name;
        this.urlD = urlD;
        this.urlT = urlT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getIn_time() {
        return in_time;
    }

    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }

    public String getIn_address() {
        return in_address;
    }

    public void setIn_address(String in_address) {
        this.in_address = in_address;
    }

    public String getOut_time() {
        return out_time;
    }

    public void setOut_time(String out_time) {
        this.out_time = out_time;
    }

    public String getOut_address() {
        return out_address;
    }

    public void setOut_address(String out_address) {
        this.out_address = out_address;
    }

    public String getRemarkD() {
        return remarkD;
    }

    public void setRemarkD(String remarkD) {
        this.remarkD = remarkD;
    }

    public String getRemarkT() {
        return remarkT;
    }

    public void setRemarkT(String remarkT) {
        this.remarkT = remarkT;
    }

    public String getStateD() {
        return stateD;
    }

    public void setStateD(String stateD) {
        this.stateD = stateD;
    }

    public String getStateT() {
        return stateT;
    }

    public void setStateT(String stateT) {
        this.stateT = stateT;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getOvertime_hours() {
        return overtime_hours;
    }

    public void setOvertime_hours(int overtime_hours) {
        this.overtime_hours = overtime_hours;
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

    public String getUrlD() {
        return urlD;
    }

    public void setUrlD(String urlD) {
        this.urlD = urlD;
    }

    public String getUrlT() {
        return urlT;
    }

    public void setUrlT(String urlT) {
        this.urlT = urlT;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", company_id=" + company_id +
                ", staff_id=" + staff_id +
                ", week='" + week + '\'' +
                ", in_time='" + in_time + '\'' +
                ", in_address='" + in_address + '\'' +
                ", out_time='" + out_time + '\'' +
                ", out_address='" + out_address + '\'' +
                ", remarkD='" + remarkD + '\'' +
                ", remarkT='" + remarkT + '\'' +
                ", overtime_hours=" + overtime_hours +
                ", stateD='" + stateD + '\'' +
                ", stateT='" + stateT + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", department_name='" + department_name + '\'' +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", urlD='" + urlD + '\'' +
                ", urlT='" + urlT + '\'' +
                '}';
    }
}
