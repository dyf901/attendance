package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Feedback" , description = "意见反馈表对象")
public class Feedback {
    @ApiModelProperty(value = "公告id" , name = "id")
    private int id;

    @ApiModelProperty(value = "集团id" , name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "员工id" , name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "反馈内容" , name = "content")
    private String content;

    @ApiModelProperty(value = "反馈图片" , name = "picture")
    private String picture;

    @ApiModelProperty(value = "上传时间" , name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "员工名称",name = "staff_name")
    private String staff_name;

    public Feedback(){
        super();
    }

    public Feedback(int id, int conglomerate_id, int staff_id, String content, String picture, String uptime, String staff_name) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.staff_id = staff_id;
        this.content = content;
        this.picture = picture;
        this.uptime = uptime;
        this.staff_name = staff_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConglomerate_id() {
        return conglomerate_id;
    }

    public void setConglomerate_id(int conglomerate_id) {
        this.conglomerate_id = conglomerate_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
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
                ", conglomerate_id=" + conglomerate_id +
                ", staff_id=" + staff_id +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", uptime='" + uptime + '\'' +
                ", staff_name='" + staff_name + '\'' +
                '}';
    }
}
