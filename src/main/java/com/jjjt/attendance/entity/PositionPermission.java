package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "PositionPermission", description = "职务权限关联表对象")
public class PositionPermission {
    @ApiModelProperty(value = "id", name = "id")
    private int id;

    @ApiModelProperty(value = "职务id", name = "position_id")
    private int position_id;

    @ApiModelProperty(value = "权限id", name = "permission_id")
    private int permission_id;

    public PositionPermission(){
        super();
    }

    public PositionPermission(int id, int position_id, int permission_id) {
        this.id = id;
        this.position_id = position_id;
        this.permission_id = permission_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", position_id=" + position_id +
                ", permission_id=" + permission_id +
                '}';
    }
}
