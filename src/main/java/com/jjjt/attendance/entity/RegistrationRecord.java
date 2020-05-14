package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "RegistrationRecord" , description = "打卡记录表对象")
public class RegistrationRecord {
    @ApiModelProperty(value = "打卡id" , name = "id")
    private int id;

    @ApiModelProperty(value = "公司id" , name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "员工id" , name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "打卡时间" , name = "time")
    private String time;

    @ApiModelProperty(value = "打卡时间戳" , name = "timeC")
    private Long timeC;

    @ApiModelProperty(value = "打卡地址" , name = "address")
    private String address;

    @ApiModelProperty(value = "备注" , name = "remark")
    private String remark;

    public RegistrationRecord(){
        super();
    }

    public RegistrationRecord(int id, int company_id, int staff_id, String time, Long timeC, String address, String remark) {
        this.id = id;
        this.company_id = company_id;
        this.staff_id = staff_id;
        this.time = time;
        this.timeC = timeC;
        this.address = address;
        this.remark = remark;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getTimeC() {
        return timeC;
    }

    public void setTimeC(Long timeC) {
        this.timeC = timeC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", company_id=" + company_id +
                ", staff_id=" + staff_id +
                ", time='" + time + '\'' +
                ", timeC=" + timeC +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
