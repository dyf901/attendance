package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Permission", description = "权限表对象")
public class Permission {
    @ApiModelProperty(value = "审批id", name = "id")
    private int id;

    @ApiModelProperty(value = "权限名称",name = "")
    private String permission_name;
}
