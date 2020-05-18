package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Company;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Registration;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.CompanyService;
import com.jjjt.attendance.service.RegistrationService;
import com.jjjt.attendance.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

@Api(description = "打卡接口")
@RestController
@RequestMapping("Registration")
@CrossOrigin
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private CompanyService companyService;

    @ApiOperation(value = "签到", notes = "传参:id(员工id),company_id(登录返回信息),in_address(打卡地址),remarkD(备注),longitude(经度),latitude(纬度)")
    @PostMapping("/InsertRegistration")
    public JsonResult InsertRegistration(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        Registration registration = new Registration();
        Staff staff = staffService.FindStaffById(map);
        map.put("department_name", staff.getDepartment_name());//根据id查询员工信息拿到部门名称塞进map数组
        System.out.println("staff:" + staff);
        System.out.println("-------------------------->");
        Company company = companyService.FindCompanyById(map);//根据conpany_id查询公司信息获取上下班时间
        System.out.println("上班时间:" + company.getIn_time());
        System.out.println("-------------------------->");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String fmDate = simpleDateFormat.format(date);
        long time1 = simpleDateFormat.parse(fmDate).getTime();
        System.out.println("当前时间的毫秒数:" + time1);
        String in_time = company.getIn_time();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");//24小时制
        long time = simpleDateFormat1.parse(in_time).getTime();//公司规定上班时间的毫秒数
        System.out.println("上班时间毫秒数:" + time);
        System.out.println("-------------------------->");
        //获取当天零点时间来判断是否是当天打卡
        long current = System.currentTimeMillis();//当前时间毫秒数
        long zero = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        System.out.println("-------------------------->");
        registration.setCompany_id((Integer) map.get("company_id"));
        registration.setStaff_id((Integer) map.get("id"));
        registration.setIn_address((String) map.get("in_address"));
        registration.setDepartment_name(staff.getDepartment_name());
        registration.setRemarkD((String) map.get("remarkD"));
        if (time1 < time && current > zero) {
            registration.setStateD("正常");
            int s = registrationService.InsertRegistration(registration);//添加打卡记录
            if (s == 1) {
                staffService.UpdateClockstatusById(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("打卡成功");
                jsonResult.setData(registrationService.FindRegistrationById(registration.getId()));
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("打卡失败");
                return jsonResult;
            }
        } else {
            registration.setStateD("迟到");
            int s = registrationService.InsertRegistration(registration);//添加打卡记录
            if (s == 1) {
                staffService.UpdateClockstatusById(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("打卡成功");
                jsonResult.setData(registrationService.FindRegistrationById(registration.getId()));
                return jsonResult;
            } else {
                jsonResult.setCode(200006);
                jsonResult.setMessage("打卡失败");
                return jsonResult;
            }

        }
    }


    @ApiOperation(value = "签退", notes = "传参:id(员工id),company_id(登录返回信息),out_address(打卡地址),remarkT(备注),longitude(经度),latitude(纬度),registration_id(打卡id,签到返回)")
    @PostMapping("/UpdateRegistration")
    public JsonResult UpdateRegistration(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        Registration registration = new Registration();
        Company company = companyService.FindCompanyById(map);//根据conpany_id查询公司信息获取上下班时间
        System.out.println("下班时间:" + company.getOut_time());
        System.out.println("-------------------------->");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String fmDate = simpleDateFormat.format(date);
        long time1 = simpleDateFormat.parse(fmDate).getTime();
        System.out.println("当前时间的毫秒数:" + time1);
        String out_time = company.getOut_time();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");//24小时制
        long time = simpleDateFormat1.parse(out_time).getTime();//公司规定上班时间的毫秒数
        System.out.println("下班时间毫秒数:" + time);
        System.out.println("-------------------------->");
        //获取当天零点时间来判断是否是当天打卡
        long current = System.currentTimeMillis();//当前时间毫秒数
        long zero = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        System.out.println("-------------------------->");
        registration.setCompany_id((Integer) map.get("company_id"));
        registration.setStaff_id((Integer) map.get("id"));
        registration.setOut_address((String) map.get("out_address"));
        registration.setRemarkT((String) map.get("remarkT"));
        registration.setId((Integer) map.get("registration_id"));
        if (time1 < time && current > zero) {
            registration.setStateT("早退");
            int s = registrationService.UpdateRegistration(registration);//添加打卡记录
            if (s == 1) {
                jsonResult.setCode(200);
                jsonResult.setMessage("打卡成功");
                return jsonResult;
            } else {
                jsonResult.setCode(20006);
                jsonResult.setMessage("打卡失败");
                return jsonResult;
            }
        } else {
            registration.setStateT("正常");
            int s = registrationService.UpdateRegistration(registration);//添加打卡记录
            if (s == 1) {
                jsonResult.setCode(200);
                jsonResult.setMessage("打卡成功");
                return jsonResult;
            } else {
                jsonResult.setCode(200006);
                jsonResult.setMessage("打卡失败");
                return jsonResult;
            }

        }
    }
}
