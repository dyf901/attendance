package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "examine" , description = "审批表对象")
public class Examine {
    @ApiModelProperty(value = "审批id" , name = "id")
    private int id;

    @ApiModelProperty(value = "员工id" , name = "staff_id")
    private int staff_id;

    @ApiModelProperty(value = "公司id" , name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "审批类型(审批,报销,出差,加班,请假)" , name = "examine_type")
    private String examine_type;

    @ApiModelProperty(value = "审批内容(包括报销内容,加班内容,出差内容,请假内容)" , name = "content")
    private String content;

    @ApiModelProperty(value = "上传时间(包括审批时间,报销时间)" , name = "uptime")
    private String uptime;

    @ApiModelProperty(value = "添加时间戳" , name = "up_timeC")
    private Long up_timeC;

    @ApiModelProperty(value = "报销类型" , name = "expenses_type")
    private String expenses_type;

    @ApiModelProperty(value = "报销金额" , name = "expenses_sum")
    private int expenses_sum;

    @ApiModelProperty(value = "报销照片" , name = "expenses_picture")
    private String expenses_picture;

    @ApiModelProperty(value = "出发时间(出差)" , name = "outtime")
    private String outtime;

    @ApiModelProperty(value = "添加时间戳" , name = "outtimeC")
    private Long outtimeC;

    @ApiModelProperty(value = "返程时间" , name = "intime")
    private String intime;

    @ApiModelProperty(value = "返程时间戳" , name = "intimeC")
    private Long intimeC;

    @ApiModelProperty(value = "出差地址" , name = "outaddress")
    private String outaddress;

    @ApiModelProperty(value = "集团id" , name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "集团名称" , name = "conglomerate_name")
    private String conglomerate_name;

    @ApiModelProperty(value ="公司名称",name = "company_name")
    private String company_name;

    public Examine(){
        super();
    }

    public Examine(int id, int staff_id, int company_id, String examine_type, String content, String uptime, Long up_timeC, String expenses_type, int expenses_sum, String expenses_picture, String outtime, Long outtimeC, String intime, Long intimeC, String outaddress, int conglomerate_id, String conglomerate_name, String company_name) {
        this.id = id;
        this.staff_id = staff_id;
        this.company_id = company_id;
        this.examine_type = examine_type;
        this.content = content;
        this.uptime = uptime;
        this.up_timeC = up_timeC;
        this.expenses_type = expenses_type;
        this.expenses_sum = expenses_sum;
        this.expenses_picture = expenses_picture;
        this.outtime = outtime;
        this.outtimeC = outtimeC;
        this.intime = intime;
        this.intimeC = intimeC;
        this.outaddress = outaddress;
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

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getExamine_type() {
        return examine_type;
    }

    public void setExamine_type(String examine_type) {
        this.examine_type = examine_type;
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

    public Long getUp_timeC() {
        return up_timeC;
    }

    public void setUp_timeC(Long up_timeC) {
        this.up_timeC = up_timeC;
    }

    public String getExpenses_type() {
        return expenses_type;
    }

    public void setExpenses_type(String expenses_type) {
        this.expenses_type = expenses_type;
    }

    public int getExpenses_sum() {
        return expenses_sum;
    }

    public void setExpenses_sum(int expenses_sum) {
        this.expenses_sum = expenses_sum;
    }

    public String getExpenses_picture() {
        return expenses_picture;
    }

    public void setExpenses_picture(String expenses_picture) {
        this.expenses_picture = expenses_picture;
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    public Long getOuttimeC() {
        return outtimeC;
    }

    public void setOuttimeC(Long outtimeC) {
        this.outtimeC = outtimeC;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public Long getIntimeC() {
        return intimeC;
    }

    public void setIntimeC(Long intimeC) {
        this.intimeC = intimeC;
    }

    public String getOutaddress() {
        return outaddress;
    }

    public void setOutaddress(String outaddress) {
        this.outaddress = outaddress;
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
                ", staff_id=" + staff_id +
                ", company_id=" + company_id +
                ", examine_type='" + examine_type + '\'' +
                ", content='" + content + '\'' +
                ", uptime='" + uptime + '\'' +
                ", up_timeC=" + up_timeC +
                ", expenses_type='" + expenses_type + '\'' +
                ", expenses_sum=" + expenses_sum +
                ", expenses_picture='" + expenses_picture + '\'' +
                ", outtime='" + outtime + '\'' +
                ", outtimeC=" + outtimeC +
                ", intime='" + intime + '\'' +
                ", intimeC=" + intimeC +
                ", outaddress='" + outaddress + '\'' +
                ", conglomerate_id=" + conglomerate_id +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
