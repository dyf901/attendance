package com.jjjt.attendance.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Supplier", description = "供应商表对象")
public class Supplier {
    @ApiModelProperty(value = "供应商id", name = "id")
    private int id;

    @ApiModelProperty(value = "集团id", name = "conglomerate_id")
    private int conglomerate_id;

    @ApiModelProperty(value = "供应商联系人", name = "contacts")
    private String contacts;

    @ApiModelProperty(value = "供应商电话", name = "contacts_phone")
    private String contacts_phone;

    @ApiModelProperty(value = "公司名称", name = "company")
    private String company;

    @ApiModelProperty(value = "开户账户", name = "account")
    private String account;

    @ApiModelProperty(value = "所属城市", name = "city")
    private String city;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "供应商品", name = "commodity")
    private String commodity;

    @ApiModelProperty(value = "黑名单", name = "blacklist")
    private String blacklist;

    @ApiModelProperty(value = "上传时间", name = "uptime")
    private String uptime;

    public Supplier(){
        super();
    }

    public Supplier(int id, int conglomerate_id, String contacts, String contacts_phone, String company, String account, String city, String address, String commodity, String blacklist, String uptime) {
        this.id = id;
        this.conglomerate_id = conglomerate_id;
        this.contacts = contacts;
        this.contacts_phone = contacts_phone;
        this.company = company;
        this.account = account;
        this.city = city;
        this.address = address;
        this.commodity = commodity;
        this.blacklist = blacklist;
        this.uptime = uptime;
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

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContacts_phone() {
        return contacts_phone;
    }

    public void setContacts_phone(String contacts_phone) {
        this.contacts_phone = contacts_phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.blacklist = blacklist;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
}
