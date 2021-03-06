package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "RegistrationRecord", description = "打卡记录表对象")
public class RegistrationRecord {
    @ApiModelProperty(value = "打卡id", name = "id")
    private int id;

    @ApiModelProperty(value = "公司id", name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "员工名称", name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "打卡时间", name = "time")
    private String time;

    @ApiModelProperty(value = "打卡时间戳", name = "timeC")
    private Long timeC;

    @ApiModelProperty(value = "打卡地址", name = "address")
    private String address;

    @ApiModelProperty(value = "经度", name = "longitude")
    private Long longitude;

    @ApiModelProperty(value = "纬度", name = "latitude")
    private Long latitude;

    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "打卡图片", name = "url")
    private String url;

    public RegistrationRecord() {
        super();
    }

    public RegistrationRecord(int id, int company_id, int staff_id, String staff_name, String time, Long timeC, String address, Long longitude, Long latitude, String remark, int conglomerate_id, String conglomerate_name, String url) {
        this.id = id;
        this.company_id = company_id;
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.time = time;
        this.timeC = timeC;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.remark = remark;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
        this.url = url;
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

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    @Override
    public String toString() {
        return "RegistrationRecord{" +
                "id=" + id +
                ", company_id=" + company_id +
                ", staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", time='" + time + '\'' +
                ", timeC=" + timeC +
                ", address='" + address + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", remark='" + remark + '\'' +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
