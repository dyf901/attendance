package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Institution", description = "制度表对象")
public class Institution {
    @ApiModelProperty(value = "制度id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "制度标题", name = "title")
    private String title;

    @ApiModelProperty(value = "制度内容", name = "content")
    private String content;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "上传时间戳", name = "uptimeC")
    private long uptimeC;

    public Institution(){
        super();
    }

    public Institution(int id, int conglomerate_id, String title, String content, String uptime, long uptimeC) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.title = title;
        this.content = content;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
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

    public long getUptimeC() {
        return uptimeC;
    }

    public void setUptimeC(long uptimeC) {
        this.uptimeC = uptimeC;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", conglomerate_id=" + conglomerate_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                '}';
    }
}
