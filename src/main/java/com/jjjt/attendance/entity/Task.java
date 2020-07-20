package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Task", description = "任务表对象")
public class Task {
    @ApiModelProperty(value = "公告id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value = "创建人id", name = "creator_id")
    private int creator_id;

    @ApiModelProperty(value = "创建人名称", name = "creator_name")
    private String creator_name;

    @ApiModelProperty(value = "负责人id", name = "principal_id")
    private int principal_id;

    @ApiModelProperty(value = "负责人名称", name = "principal_name")
    private String principal_name;

    @ApiModelProperty(value = "参与人(员工id数组)", name = "participant")
    private String participant;

    @ApiModelProperty(value = "任务标题(必填)", name = "task_title")
    private String task_title;

    @ApiModelProperty(value = "任务描述", name = "task_describe")
    private String task_describe;

    @ApiModelProperty(value = "发布任务图片", name = "start_img")
    private String start_img;

    @ApiModelProperty(value = "任务开始时间", name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "任务开始时间戳", name = "uptimeC")
    private long uptimeC;

    @ApiModelProperty(value = "任务结束时间", name = "end_time")
    private String end_time;

    @ApiModelProperty(value = "任务结束时间戳", name = "end_timeC")
    private long end_timeC;

    @ApiModelProperty(value = "任务紧急程度", name = "degree")
    private String degree;

    @ApiModelProperty(value = "任务总结", name = "task_summarize")
    private String task_summarize;

    @ApiModelProperty(value = "申请理由(申请结束)", name = "task_reason")
    private String task_reason;

    @ApiModelProperty(value = "结束图片", name = "end_img")
    private String end_img;

    @ApiModelProperty(value = "审核理由", name = "check")
    private String check;

    @ApiModelProperty(value = "任务状态(进行中,审核中,已完成,已撤销)", name = "state")
    private String state;

    @ApiModelProperty(value = "完成状态(延迟,正常)", name = "status")
    private String status;

    public Task(){
        super();
    }

    public Task(int id, int conglomerate_id, String conglomerate_name, int creator_id, String creator_name, int principal_id, String principal_name, String participant, String task_title, String task_describe, String start_img, String uptime, long uptimeC, String end_time, long end_timeC, String degree, String task_summarize, String task_reason, String end_img, String check, String state, String status) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.conglomerate_name = conglomerate_name;
        this.creator_id = creator_id;
        this.creator_name = creator_name;
        this.principal_id = principal_id;
        this.principal_name = principal_name;
        this.participant = participant;
        this.task_title = task_title;
        this.task_describe = task_describe;
        this.start_img = start_img;
        this.uptime = uptime;
        this.uptimeC = uptimeC;
        this.end_time = end_time;
        this.end_timeC = end_timeC;
        this.degree = degree;
        this.task_summarize = task_summarize;
        this.task_reason = task_reason;
        this.end_img = end_img;
        this.check = check;
        this.state = state;
        this.status = status;
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

    public String getConglomerate_name() {
        return conglomerate_name;
    }

    public void setConglomerate_name(String conglomerate_name) {
        this.conglomerate_name = conglomerate_name;
    }

    public int getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(int creator_id) {
        this.creator_id = creator_id;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public int getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(int principal_id) {
        this.principal_id = principal_id;
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public String getTask_describe() {
        return task_describe;
    }

    public void setTask_describe(String task_describe) {
        this.task_describe = task_describe;
    }

    public String getStart_img() {
        return start_img;
    }

    public void setStart_img(String start_img) {
        this.start_img = start_img;
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

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public long getEnd_timeC() {
        return end_timeC;
    }

    public void setEnd_timeC(long end_timeC) {
        this.end_timeC = end_timeC;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTask_summarize() {
        return task_summarize;
    }

    public void setTask_summarize(String task_summarize) {
        this.task_summarize = task_summarize;
    }

    public String getTask_reason() {
        return task_reason;
    }

    public void setTask_reason(String task_reason) {
        this.task_reason = task_reason;
    }

    public String getEnd_img() {
        return end_img;
    }

    public void setEnd_img(String end_img) {
        this.end_img = end_img;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", creator_id=" + creator_id +
                ", creator_name='" + creator_name + '\'' +
                ", principal_id=" + principal_id +
                ", principal_name='" + principal_name + '\'' +
                ", participant='" + participant + '\'' +
                ", task_title='" + task_title + '\'' +
                ", task_describe='" + task_describe + '\'' +
                ", start_img='" + start_img + '\'' +
                ", uptime='" + uptime + '\'' +
                ", uptimeC=" + uptimeC +
                ", end_time='" + end_time + '\'' +
                ", end_timeC=" + end_timeC +
                ", degree='" + degree + '\'' +
                ", task_summarize='" + task_summarize + '\'' +
                ", task_reason='" + task_reason + '\'' +
                ", end_img='" + end_img + '\'' +
                ", check='" + check + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
