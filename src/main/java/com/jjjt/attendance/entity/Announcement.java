package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "announcement" , description = "公告表对象")
public class Announcement {
    @ApiModelProperty(value = "公告id" , name = "id")
    private int id;

    @ApiModelProperty(value = "公告标题" , name = "title")
    private String title;

    @ApiModelProperty(value = "公告内容" , name = "content")
    private String content;

    @ApiModelProperty(value = "发布时间" , name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "发布时间戳" , name = "uptimeC")
    private Long uptimeC;

    @ApiModelProperty(value = "阅读量" , name = "read_count")
    private int read_count;

    public Announcement(){
        super();
    }

    public Announcement(int id, String title, String content, String uptime, Long uptimeC, int read_count) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
        this.read_count = read_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public Long getUptimeC() {
        return uptimeC;
    }

    public void setUptimeC(Long uptimeC) {
        this.uptimeC = uptimeC;
    }

    public int getRead_count() {
        return read_count;
    }

    public void setRead_count(int read_count) {
        this.read_count = read_count;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                ", read_count=" + read_count +
                '}';
    }
}
