package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Position" , description = "职务表对象")
public class Position {
    @ApiModelProperty(value = "职务id" , name = "id")
    private int id;

    @ApiModelProperty(value = "职务名称" , name = "position_name")
    private String position_name;

    public Position(){
        super();
    }

    public Position(int id, String position_name) {
        this.id = id;
        this.position_name = position_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", position_name='" + position_name + '\'' +
                '}';
    }
}
