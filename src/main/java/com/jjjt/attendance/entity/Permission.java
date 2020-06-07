package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Permission", description = "权限表对象")
public class Permission {
    @ApiModelProperty(value = "审批id", name = "id")
    private int id;

    @ApiModelProperty(value = "权限名称", name = "")
    private String permission_name;

    public Permission() {
        super();
    }

    public Permission(int id, String permission_name) {
        this.id = id;
        this.permission_name = permission_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permission_name='" + permission_name + '\'' +
                '}';
    }
}
