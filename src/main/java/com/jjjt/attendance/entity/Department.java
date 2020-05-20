package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "department" , description = "部门表对象")
public class Department {
    @ApiModelProperty(value = "部门id" , name = "id")
    private int id;

    @ApiModelProperty(value = "公司id" , name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "部门名称" , name = "department_name")
    private String department_name;

    @ApiModelProperty(value = "部门人数" , name = "person_count")
    private int person_count;

    @ApiModelProperty(value = "集团id" , name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称" , name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "公司名称" , name = "company_name")
    private String company_name;

    public Department(){
        super();
    }

    public Department(int id, int company_id, String department_name, int person_count, int conglomerate_id, String conglomerate_name, String company_name) {
        this.id = id;
        this.company_id = company_id;
        this.department_name = department_name;
        this.person_count = person_count;
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

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getPerson_count() {
        return person_count;
    }

    public void setPerson_count(int person_count) {
        this.person_count = person_count;
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
        return "Department{" +
                "id=" + id +
                ", company_id=" + company_id +
                ", department_name='" + department_name + '\'' +
                ", person_count=" + person_count +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
