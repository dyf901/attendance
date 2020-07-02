package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ProjectLog", description = "项目日志表对象")
public class ProjectLog {
    @ApiModelProperty(value = "公告id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id",name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "项目id", name = "project_id")
    private int project_id;

    @ApiModelProperty(value = "项目名称", name = "project_name")
    private String project_name;

    @ApiModelProperty(value = "项目日志内容", name = "content")
    private String content;

    @ApiModelProperty(value = "日志图片", name = "url")
    private String url;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "上传时间戳", name = "uptimeC")
    private long uptimeC;

    public ProjectLog(){
        super();
    }

    public ProjectLog(int id, int conglomerate_id, int project_id, String project_name, String content, String url, String uptime, long uptimeC) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.project_id = project_id;
        this.project_name = project_name;
        this.content = content;
        this.url = url;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public long getUptimeC() {
        return uptimeC;
    }

    public void setUptimeC(long uptimeC) {
        this.uptimeC = uptimeC;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public int getConglomerate_id() {
        return conglomerate_id;
    }

    public void setConglomerate_id(int conglomerate_id) {
        this.conglomerate_id = conglomerate_id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", conglomerate_id=" + conglomerate_id +
                ", project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                '}';
    }
}
