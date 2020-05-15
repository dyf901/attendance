package com.jjjt.attendance.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Staff" , description = "员工表对象")
public class Staff {
    @ApiModelProperty(value = "员工id" , name = "id")
    private int id;

    @ApiModelProperty(value = "员工姓名" , name = "staff_name")
    private String staff_name;

    @ApiModelProperty(value = "员工年龄" , name = "staff_age")
    private int staff_age;

    @ApiModelProperty(value = "性别" , name = "staff_img")
    private String staff_img;

    @ApiModelProperty(value = "签到时间" , name = "staff_sex")
    private String staff_sex;

    @ApiModelProperty(value = "身份证号码" , name = "staff_card")
    private String staff_card;

    @ApiModelProperty(value = "民族" , name = "staff_nation")
    private String staff_nation;

    @ApiModelProperty(value = "身份证地址" , name = "staff_address")
    private String staff_address;

    @ApiModelProperty(value = "手机号(app登录账号)" , name = "staff_phone")
    private String staff_phone;

    @ApiModelProperty(value = "紧急联系人姓名" , name = "sos_name")
    private String sos_name;

    @ApiModelProperty(value = "紧急联系人关系" , name = "sos_ship")
    private String sos_ship;

    @ApiModelProperty(value = "紧急联系人电话" , name = "sos_phone")
    private String sos_phone;

    @ApiModelProperty(value = "入职时间" , name = "entry_time")
    private String entry_time;

    @ApiModelProperty(value = "所属公司id" , name = "company_id")
    private int company_id;

    @ApiModelProperty(value = "部门id" , name = "department_id")
    private int department_id;

    @ApiModelProperty(value = "职务id" , name = "position_id")
    private int position_id;

    @ApiModelProperty(value = "账号密码" , name = "password")
    private String password;

    @ApiModelProperty(value = "头像" , name = "picture")
    private String picture;

    @ApiModelProperty(value = "昵称" , name = "nickname")
    private String nickname;

    @ApiModelProperty(value = "个性签名" , name = "signature")
    private String signature;

    @ApiModelProperty(value = "在职状态('0' 离职  '1'在职)" , name = "state")
    private String state;

    @ApiModelProperty(value = "打卡状态('1' 签到  '0' 签退)" , name = "clockstatus")
    private String clockstatus;

    @ApiModelProperty(value = "所属公司id" , name = "company_name")
    private String company_name;

    @ApiModelProperty(value = "部门id" , name = "department_name")
    private String department_name;

    @ApiModelProperty(value = "职务id" , name = "position_name")
    private String position_name;

    public Staff(){
        super();
    }

    public Staff(int id, String staff_name, int staff_age, String staff_img, String staff_sex, String staff_card, String staff_nation, String staff_address, String staff_phone, String sos_name, String sos_ship, String sos_phone, String entry_time, int company_id, int department_id, int position_id, String password, String picture, String nickname, String signature, String state, String clockstatus, String company_name, String department_name, String position_name) {
        this.id = id;
        this.staff_name = staff_name;
        this.staff_age = staff_age;
        this.staff_img = staff_img;
        this.staff_sex = staff_sex;
        this.staff_card = staff_card;
        this.staff_nation = staff_nation;
        this.staff_address = staff_address;
        this.staff_phone = staff_phone;
        this.sos_name = sos_name;
        this.sos_ship = sos_ship;
        this.sos_phone = sos_phone;
        this.entry_time = entry_time;
        this.company_id = company_id;
        this.department_id = department_id;
        this.position_id = position_id;
        this.password = password;
        this.picture = picture;
        this.nickname = nickname;
        this.signature = signature;
        this.state = state;
        this.clockstatus = clockstatus;
        this.company_name = company_name;
        this.department_name = department_name;
        this.position_name = position_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public String getStaff_img() {
        return staff_img;
    }

    public void setStaff_img(String staff_img) {
        this.staff_img = staff_img;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getStaff_card() {
        return staff_card;
    }

    public void setStaff_card(String staff_card) {
        this.staff_card = staff_card;
    }

    public String getStaff_nation() {
        return staff_nation;
    }

    public void setStaff_nation(String staff_nation) {
        this.staff_nation = staff_nation;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public String getSos_name() {
        return sos_name;
    }

    public void setSos_name(String sos_name) {
        this.sos_name = sos_name;
    }

    public String getSos_ship() {
        return sos_ship;
    }

    public void setSos_ship(String sos_ship) {
        this.sos_ship = sos_ship;
    }

    public String getSos_phone() {
        return sos_phone;
    }

    public void setSos_phone(String sos_phone) {
        this.sos_phone = sos_phone;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getClockstatus() {
        return clockstatus;
    }

    public void setClockstatus(String clockstatus) {
        this.clockstatus = clockstatus;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", staff_name='" + staff_name + '\'' +
                ", staff_age=" + staff_age +
                ", staff_img='" + staff_img + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_card='" + staff_card + '\'' +
                ", staff_nation='" + staff_nation + '\'' +
                ", staff_address='" + staff_address + '\'' +
                ", staff_phone='" + staff_phone + '\'' +
                ", sos_name='" + sos_name + '\'' +
                ", sos_ship='" + sos_ship + '\'' +
                ", sos_phone='" + sos_phone + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", company_id=" + company_id +
                ", department_id=" + department_id +
                ", position_id=" + position_id +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                ", nickname='" + nickname + '\'' +
                ", signature='" + signature + '\'' +
                ", state='" + state + '\'' +
                ", clockstatus='" + clockstatus + '\'' +
                ", company_name='" + company_name + '\'' +
                ", department_name='" + department_name + '\'' +
                ", position_name='" + position_name + '\'' +
                '}';
    }
}
