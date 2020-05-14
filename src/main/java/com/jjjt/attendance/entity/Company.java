package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "company" , description = "公司表对象")
public class Company {
    @ApiModelProperty(value = "公司id" , name = "id")
    private int id;

    @ApiModelProperty(value = "公司名称" , name = "company_name")
    private String company_name;

    @ApiModelProperty(value = "公司人数" , name = "person_count")
    private int person_count;

    public Company(){
        super();
    }

    public Company(int id, String company_name, int person_count) {
        this.id = id;
        this.company_name = company_name;
        this.person_count = person_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getPerson_count() {
        return person_count;
    }

    public void setPerson_count(int person_count) {
        this.person_count = person_count;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", person_count=" + person_count +
                '}';
    }
}
