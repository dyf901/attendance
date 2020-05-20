package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "client" , description = "客户表对象")
public class Client {
    @ApiModelProperty(value = "客户id" , name = "id")
    private int id;

    @ApiModelProperty(value = "员工id" , name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "公司id" , name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "客户名称" , name = "client_name")
    private String client_name;

    @ApiModelProperty(value = "客户性别" , name = "client_sex")
    private String client_sex;

    @ApiModelProperty(value = "客户所属职位" , name = "client_position")
    private String client_position;

    @ApiModelProperty(value = "客户所在部门" , name = "client_department")
    private String client_department;

    @ApiModelProperty(value = "客户手机号" , name = "client_phone")
    private String client_phone;

    @ApiModelProperty(value = "添加时间" , name = "up_time")
    private String up_time;

    @ApiModelProperty(value = "添加时间戳" , name = "up_timeC")
    private Long up_timeC;

    @ApiModelProperty(value = "所属项目" , name = "company")
    private String company;

    @ApiModelProperty(value = "集团id" , name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称" , name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "公司名称" , name = "company_name")
    private String company_name;

    public Client(){
        super();
    }

    public Client(int id, int staff_id, int company_id, String client_name, String client_sex, String client_position, String client_department, String client_phone, String up_time, Long up_timeC, String company, int conglomerate_id, String conglomerate_name, String company_name) {
        this.id = id;
        this.staff_id = staff_id;
        this.company_id = company_id;
        this.client_name = client_name;
        this.client_sex = client_sex;
        this.client_position = client_position;
        this.client_department = client_department;
        this.client_phone = client_phone;
        this.up_time = up_time;
        this.up_timeC = up_timeC;
        this.company = company;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
        this.company_name = company_name;
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

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_sex() {
        return client_sex;
    }

    public void setClient_sex(String client_sex) {
        this.client_sex = client_sex;
    }

    public String getClient_position() {
        return client_position;
    }

    public void setClient_position(String client_position) {
        this.client_position = client_position;
    }

    public String getClient_department() {
        return client_department;
    }

    public void setClient_department(String client_department) {
        this.client_department = client_department;
    }

    public String getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(String client_phone) {
        this.client_phone = client_phone;
    }

    public String getUp_time() {
        return up_time;
    }

    public void setUp_time(String up_time) {
        this.up_time = up_time;
    }

    public Long getUp_timeC() {
        return up_timeC;
    }

    public void setUp_timeC(Long up_timeC) {
        this.up_timeC = up_timeC;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", company_id=" + company_id +
                ", client_name='" + client_name + '\'' +
                ", client_sex='" + client_sex + '\'' +
                ", client_position='" + client_position + '\'' +
                ", client_department='" + client_department + '\'' +
                ", client_phone='" + client_phone + '\'' +
                ", up_time='" + up_time + '\'' +
                ", up_timeC=" + up_timeC +
                ", company='" + company + '\'' +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
