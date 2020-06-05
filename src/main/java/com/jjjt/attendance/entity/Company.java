package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "company", description = "公司表对象")
public class Company {
    @ApiModelProperty(value = "公司id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "公司名称", name = "company_name")
    private String company_name;

    @ApiModelProperty(value = "公司人数", name = "person_count")
    private int person_count;

    @ApiModelProperty(value = "上班时间", name = "in_time")
    private String in_time;

    @ApiModelProperty(value = "下班时间", name = "out_time")
    private String out_time;

    @ApiModelProperty(value = "集团名称", name = "conglomerate_name")
    private String conglomerate_name;

    public Company() {
        super();
    }

    public Company(int id, int conglomerate_id, String company_name, int person_count, String in_time, String out_time, String conglomerate_name) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.company_name = company_name;
        this.person_count = person_count;
        this.in_time = in_time;
        this.out_time = out_time;
        this.conglomerate_name = conglomerate_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getPerson_count() {
        return person_count;
    }

    public void setPerson_count(int person_count) {
        this.person_count = person_count;
    }

    public String getIn_time() {
        return in_time;
    }

    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }

    public String getOut_time() {
        return out_time;
    }

    public void setOut_time(String out_time) {
        this.out_time = out_time;
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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", conglomerate_id=" + conglomerate_id +
                ", company_name='" + company_name + '\'' +
                ", person_count=" + person_count +
                ", in_time='" + in_time + '\'' +
                ", out_time='" + out_time + '\'' +
                ", conglomerate_name='" + conglomerate_name + '\'' +
                '}';
    }
}
