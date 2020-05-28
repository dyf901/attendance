package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "client" , description = "客户表对象")
public class Client {
    @ApiModelProperty(value = "客户id" , name = "id")
    private int id;

    @ApiModelProperty(value = "项目id" , name = "items_id")
    private int items_id;

    @ApiModelProperty(value = "联系人姓名" , name = "client_name")
    private String client_name;

    @ApiModelProperty(value = "联系人性别" , name = "client_sex")
    private String client_sex;

    @ApiModelProperty(value = "联系人所属职位" , name = "client_position")
    private String client_position;

    @ApiModelProperty(value = "联系人所在部门" , name = "client_department")
    private String client_department;

    @ApiModelProperty(value = "联系人手机号" , name = "client_phone")
    private String client_phone;

    @ApiModelProperty(value = "项目名称" , name = "items_name")
    private String items_name;

    public Client(){
        super();
    }

    public Client(int id, int items_id, String client_name, String client_sex, String client_position, String client_department, String client_phone, String items_name) {
        this.id = id;
        this.items_id = items_id;
        this.client_name = client_name;
        this.client_sex = client_sex;
        this.client_position = client_position;
        this.client_department = client_department;
        this.client_phone = client_phone;
        this.items_name = items_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
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

    public String getItems_name() {
        return items_name;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", items_id=" + items_id +
                ", client_name='" + client_name + '\'' +
                ", client_sex='" + client_sex + '\'' +
                ", client_position='" + client_position + '\'' +
                ", client_department='" + client_department + '\'' +
                ", client_phone='" + client_phone + '\'' +
                ", items_name='" + items_name + '\'' +
                '}';
    }
}
