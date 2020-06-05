package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Items", description = "项目表对象")
public class Items {
    @ApiModelProperty(value = "项目id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "id")
    private int conglomerate_id;

    @ApiModelProperty(value = "项目名称", name = "items_name")
    private String items_name;

    @ApiModelProperty(value = "所属集团", name = "bloc_name")
    private String bloc_name;

    @ApiModelProperty(value = "类型", name = "type")
    private String type;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "上传时间戳", name = "uptimeC")
    private long uptimeC;

    public Items() {
        super();
    }

    public Items(int id, int conglomerate_id, String items_name, String bloc_name, String type, String uptime, long uptimeC) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.items_name = items_name;
        this.bloc_name = bloc_name;
        this.type = type;
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

    public String getItems_name() {
        return items_name;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    public String getBloc_name() {
        return bloc_name;
    }

    public void setBloc_name(String bloc_name) {
        this.bloc_name = bloc_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", conglomerate_id=" + conglomerate_id +
                ", items_name='" + items_name + '\'' +
                ", bloc_name='" + bloc_name + '\'' +
                ", type='" + type + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                '}';
    }
}
