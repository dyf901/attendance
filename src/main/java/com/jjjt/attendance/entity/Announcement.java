package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "announcement", description = "公告表对象")
public class Announcement {
    @ApiModelProperty(value = "公告id", name = "id")
    private int id;

    @ApiModelProperty(value = "公司id", name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "公告标题", name = "title")
    private String title;

    @ApiModelProperty(value = "公告内容", name = "content")
    private String content;

    @ApiModelProperty(value = "发布时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "发布时间戳", name = "uptimeC")
    private Long uptimeC;

    @ApiModelProperty(value = "阅读量", name = "read_count")
    private int read_count;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "公司名称", name = "company_name")
    private String company_name;

    public Announcement() {
        super();
    }

    public Announcement(int id, int company_id, String title, String content, String uptime, Long uptimeC, int read_count, int conglomerate_id, String conglomerate_name, String company_name) {
        this.id = id;
        this.company_id = company_id;
        this.title = title;
        this.content = content;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
        this.read_count = read_count;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
        this.company_name = company_name;
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

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
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

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", company_id=" + company_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                ", read_count=" + read_count +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
