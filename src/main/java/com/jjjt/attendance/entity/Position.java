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

    @ApiModelProperty(value = "集团id" , name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称" , name = "conglomerate_name")
    private String conglomerate_name;

    public Position(){
        super();
    }

    public Position(int id, String position_name, int conglomerate_id, String conglomerate_name) {
        this.id = id;
        this.position_name = position_name;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", position_name='" + position_name + '\'' +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                '}';
    }
}
