package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Balance", description = "支出申请单表实体类")
public class Balance {
    @ApiModelProperty(value = "收支id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "所属公司id", name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "所属公司名称", name = "company_name")
    private String company_name;

    @ApiModelProperty(value = "客户id", name = "items_id")
    private int items_id;

    @ApiModelProperty(value = "客户名称", name = "items_name")
    private String items_name;

    @ApiModelProperty(value = "项目id", name = "project_id")
    private int project_id;

    @ApiModelProperty(value = "项目名称", name = "project_name")
    private String project_name;

    @ApiModelProperty(value = "供应商id", name = "supplier_id")
    private int supplier_id;

    @ApiModelProperty(value = "供应商名称", name = "supplier_name")
    private String supplier_name;

    @ApiModelProperty(value = "费用类型", name = "cost_types")
    private String cost_types;

    @ApiModelProperty(value = "支付金额", name = "payment_amount")
    private String payment_amount;

    @ApiModelProperty(value = "付款日期", name = "payment_time")
    private String payment_time;

    @ApiModelProperty(value = "说明", name = "explain")
    private String explain;

    @ApiModelProperty(value = "图片", name = "picture")
    private String picture;

    @ApiModelProperty(value = "是否有发票(0/1,无/有)", name = "state")
    private String state;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    public Balance(){
        super();
    }

    public Balance(int id, int conglomerate_id, int company_id, String company_name, int items_id, String items_name, int project_id, String project_name, int supplier_id, String supplier_name, String cost_types, String payment_amount, String payment_time, String explain, String picture, String state, String uptime) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.company_id = company_id;
        this.company_name = company_name;
        this.items_id = items_id;
        this.items_name = items_name;
        this.project_id = project_id;
        this.project_name = project_name;
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.cost_types = cost_types;
        this.payment_amount = payment_amount;
        this.payment_time = payment_time;
        this.explain = explain;
        this.picture = picture;
        this.state = state;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getCost_types() {
        return cost_types;
    }

    public void setCost_types(String cost_types) {
        this.cost_types = cost_types;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(String payment_time) {
        this.payment_time = payment_time;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getItems_name() {
        return items_name;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getConglomerate_id() {
        return conglomerate_id;
    }

    public void setConglomerate_id(int conglomerate_id) {
        this.conglomerate_id = conglomerate_id;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
}
