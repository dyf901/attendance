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

    @ApiModelProperty(value = "备注" , name = "remark")
    private String remark;

    @ApiModelProperty(value = "状态" , name = "state")
    private String state;

    public Registration(){
        super();
    }

    public Registration(int id, int company_id, int staff_id, String in_time, String in_address, String out_time, String out_address, String remark, String state) {
        this.id = id;
        this.company_id = company_id;
        this.staff_id = staff_id;
        this.in_time = in_time;
        this.in_address = in_address;
        this.out_time = out_time;
        this.out_address = out_address;
        this.remark = remark;
        this.state = state;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
                ", company_id=" + company_id +
                ", staff_id=" + staff_id +
                ", in_time='" + in_time + '\'' +
                ", in_address='" + in_address + '\'' +
                ", out_time='" + out_time + '\'' +
                ", out_address='" + out_address + '\'' +
                ", remark='" + remark + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
