package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "StaffItems", description = "员工项目关联表对象")
public class StaffItems {
    @ApiModelProperty(value = "客户id", name = "id")
    private int id;

    @ApiModelProperty(value = "员工id", name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "项目id", name = "items_id")
    private int items_id;

    @ApiModelProperty(value = "上传时间",name = "uptime")
    private String uptime;

    public StaffItems() {
        super();
    }

    public StaffItems(int id, int staff_id, int items_id, String uptime) {
        this.id = id;
        this.staff_id = staff_id;
        this.items_id = items_id;
        this.uptime = uptime;
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

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", staff_id=" + staff_id +
                ", items_id=" + items_id +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
