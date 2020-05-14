package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "department" , description = "部门表对象")
public class Department {
    @ApiModelProperty(value = "部门id" , name = "id")
    private int id;

    @ApiModelProperty(value = "部门名称" , name = "department_name")
    private String department_name;

    @ApiModelProperty(value = "部门人数" , name = "person_count")
    private int person_count;

    public Department(){
        super();
    }

    public Department(int id, String department_name, int person_count) {
        this.id = id;
        this.department_name = department_name;
        this.person_count = person_count;
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", person_count=" + person_count +
                '}';
    }
}
