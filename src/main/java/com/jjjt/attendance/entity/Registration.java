package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Registration" , description = "打卡表对象")
public class Registration {
    @ApiModelProperty(value = "打卡id" , name = "id")
    private int id;

    @ApiModelProperty(value = "公司id" , name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "员工id" , name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "签到时间" , name = "in_time")
    private String in_time;

    @ApiModelProperty(value = "签到地址" , name = "in_address")
    private String in_address;

    @ApiModelProperty(value = "签退时间" , name = "out_time")
    private String out_time;

    @ApiModelProperty(value = "签退地址" , name = "out_address")
    private String out_address;

    @ApiModelProperty(value = "签到备注" , name = "remarkD")
    private String remarkD;

    @ApiModelProperty(value = "签退备注" , name = "remarkT")
    private String remarkT;

    @ApiModelProperty(value = "状态" , name = "stateD")
    private String stateD;

    @ApiModelProperty(value = "状态" , name = "stateD")
    private String stateT;

    @ApiModelProperty(value = "员工姓名" , name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "员工姓名" , name = "department_name")
    private String department_name;

    public Registration(){
        super();
    }

    public Registration(int id, int company_id, int staff_id, String in_time, String in_address, String out_time, String out_address, String remarkD, String remarkT, String stateD, String stateT, String staff_name, String department_name) {
        this.id = id;
        this.company_id = company_id;
        this.staff_id = staff_id;
        this.in_time = in_time;
        this.in_address = in_address;
        this.out_time = out_time;
        this.out_address = out_address;
        this.remarkD = remarkD;
        this.remarkT = remarkT;
        this.stateD = stateD;
        this.stateT = stateT;
        this.staff_name = staff_name;
        this.department_name = department_name;
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", company_id=" + company_id +
                ", staff_id=" + staff_id +
                ", in_time='" + in_time + '\'' +
                ", in_address='" + in_address + '\'' +
                ", out_time='" + out_time + '\'' +
                ", out_address='" + out_address + '\'' +
                ", remarkD='" + remarkD + '\'' +
                ", remarkT='" + remarkT + '\'' +
                ", stateD='" + stateD + '\'' +
                ", stateT='" + stateT + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", department_name='" + department_name + '\'' +
                '}';
    }
}
