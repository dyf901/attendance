package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Company;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Registration;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.CompanyService;
import com.jjjt.attendance.service.RegistrationService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        System.out.println("map:"+map);
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
        Date date1 = new Date();
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        System.out.println(weekDays[w]);
        registration.setWeek(weekDays[w]);
        registration.setCompany_id((Integer) map.get("company_id"));
        registration.setStaff_id((Integer) map.get("id"));
        registration.setIn_address((String) map.get("in_address"));
        registration.setDepartment_name(staff.getDepartment_name());
        registration.setRemarkD((String) map.get("remarkD"));
        registration.setStaff_name(staff.getStaff_name());
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
        System.out.println("map:"+map);
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
        Date datel=new Date();
        SimpleDateFormat simpleDateFormatl = new SimpleDateFormat("HH:mm:ss");
        String fmDatel=simpleDateFormatl.format(datel);
        System.out.println(fmDatel);
        long time1l=simpleDateFormat.parse(fmDatel).getTime();
        System.out.println(time1l);
        String in_time = "18:30:00";
        SimpleDateFormat simpleDateFormat1l = new SimpleDateFormat("HH:mm:ss");//24小时制
        long timel = simpleDateFormat1.parse(in_time).getTime();//获取固定时间的毫秒数
        System.out.println(timel);
        if(time1l>=timel){
            Date datez = new Date();
            SimpleDateFormat simpleDateFormatz = new SimpleDateFormat("HH:mm:ss");
            String fmDatez = simpleDateFormatz.format(datez);
            long time1z = simpleDateFormatz.parse(fmDatez).getTime();
            //从对象中拿到时间
            String in_timez = "18:00:00";
            long createTime = simpleDateFormatz.parse(in_timez).getTime();
            int diff= (int) ((time1z-createTime)/1000/60);
            registration.setOvertime_hours(diff);
        }
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


    @ApiOperation(value = "导出excel" , notes = "")
    @PostMapping("/ExportExcel")
    public void downloadAllClassmate(HttpServletResponse response,@RequestBody Map map) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("考勤表");

       /* Map map = new HashMap();
        map.put("company_id" , 1);*/
        //List<Teacher> classmateList = teacherservice.teacherinfor();
        List<Registration> list = registrationService.ExportExcel(map);
        String fileName = "checking-in" + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = {"姓名" , "部门" , "星期" , "签到时间" , "签退时间" , "加班时长","备注"};
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (Registration registration : list) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(registration.getStaff_name());
            row1.createCell(1).setCellValue(registration.getDepartment_name());
            row1.createCell(2).setCellValue(registration.getWeek());
            row1.createCell(3).setCellValue(registration.getIn_time());
            row1.createCell(4).setCellValue(registration.getOut_time());
            row1.createCell(5).setCellValue(registration.getOvertime_hours());
            row1.createCell(6).setCellValue(registration.getRemarkT());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition" , "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

    @ApiOperation(value = "分页模糊查询打卡信息",notes = "")
    @PostMapping("/FindRegistration")
    public Page<T> FindRegistration(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(registrationService.Total(map));
        page.setItems(registrationService.FindRegistration(map));
        return page;
    }
}
