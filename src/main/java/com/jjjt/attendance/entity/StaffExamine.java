package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "StaffExamine", description = "员工审批关联表对象")
public class StaffExamine {
    @ApiModelProperty(value = "客户id", name = "id")
    private int id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "项目id", name = "examine_id")
    private int examine_id;

    public StaffExamine(){
        super();
    }

    public StaffExamine(int id, int staff_id, int examine_id) {
        this.id = id;
        this.staff_id = staff_id;
        this.examine_id = examine_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getExamine_id() {
        return examine_id;
    }

    public void setExamine_id(int examine_id) {
        this.examine_id = examine_id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", examine_id=" + examine_id +
                '}';
    }
}
