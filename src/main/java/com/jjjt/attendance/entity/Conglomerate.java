package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Conglomerate", description = "集团表对象")
public class Conglomerate {
    @ApiModelProperty(value = "集团id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "集团人数", name = "person_count")
    private int person_count;

    public Conglomerate() {
        super();
    }

    public Conglomerate(int id, String conglomerate_name, int person_count) {
        this.id = id;
        this.conglomerate_name = conglomerate_name;
        this.person_count = person_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConglomerate_name() {
        return conglomerate_name;
    }

    public void setConglomerate_name(String conglomerate_name) {
        this.conglomerate_name = conglomerate_name;
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
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", person_count=" + person_count +
                '}';
    }
}
