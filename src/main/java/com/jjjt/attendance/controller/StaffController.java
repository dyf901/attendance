package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Company;
import com.jjjt.attendance.entity.Department;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.CompanyService;
import com.jjjt.attendance.service.DepartmentService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.jjjt.attendance.util.NickUtil.getNickname;
import static com.jjjt.attendance.util.NickUtil.setNickname;

@Api(description = "员工信息接口")
@RestController
@RequestMapping("Staff")
@CrossOrigin
public class StaffController {
    @Autowired
    private StaffService staffService;//员工

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private CompanyService companyService;

    @ApiOperation(value = "增加员工信息", notes = "")
    @PostMapping("/InsertStaff")
    public boolean InsertStaff(@RequestBody Map map) {
        setNickname();
        String nickname = getNickname();
        map.put("nickname", nickname);
        String id = (String) map.get("staff_phone");
        String lastWord = id.substring(id.length() - 1);
        String reg = "[a-zA-Z]";
        if (lastWord.matches(reg)) {//截取身份证号后六位数字当app登录密码
            String password = id.substring(id.length() - 7, id.length() - 1);
            System.out.println("略过字母：" + password);
            map.put("password", password);
        } else {
            String password = id.substring(id.length() - 6);
            System.out.println(id.substring(id.length() - 6));
            map.put("password", password);
        }

        int i = staffService.InsertStaff(map);
        if (i == 1) {
            Department department = departmentService.FindDepartmentById(map);
            map.put("person_countD", department.getPerson_count() + 1);
            int iq = departmentService.UpdatePersonCount(map);
            Company company = companyService.FindCompanyById(map);
            map.put("person_countC", company.getPerson_count() + 1);
            int iqa = companyService.UpdatePersonCount(map);
            return true;
        } else {
            return false;
        }
    }


    @ApiOperation(value = "删除员工信息", notes = "")
    @PostMapping("/DeleteStaff")
    public boolean DeleteStaff(@RequestBody Map map) {
        int i = staffService.DeleteStaff(map);
        if (i == 1) {
            Department department = departmentService.FindDepartmentById(map);
            map.put("person_countD", department.getPerson_count() - 1);
            departmentService.UpdatePersonCount(map);
            Company company = companyService.FindCompanyById(map);
            map.put("person_countC", company.getPerson_count() - 1);
            companyService.UpdatePersonCount(map);
            return true;
        } else {
            return false;
        }
    }

    @ApiOperation(value = "修改员工信息", notes = "")
    @PostMapping("/UpdateStaff")
    public boolean UpdateStaff(@RequestBody Map map) {
        return staffService.UpdateStaff(map) == 1;
    }

    @ApiOperation(value = "分页模糊查询员工信息", notes = "")
    @PostMapping("/FindStaff")
    public Page<Staff> FindStaff(@RequestBody Map map) {
        Page<Staff> page = new Page<Staff>();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffService.Total(map));
        page.setItems(staffService.FindStaff(map));
        return page;
    }

    @ApiOperation(value = "app修改员工信息", notes = "")
    @PostMapping("/UpdateStaffApp")
    public JsonResult UpdateStaffApp(@RequestBody Map map) {
        System.out.println("map:" + map);
        JsonResult jsonResult = new JsonResult();
        int i = staffService.UpdateStaffApp(map);
        if (i == 1) {
            jsonResult.setCode(200);
            jsonResult.setMessage("修改成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("修改失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "查询员工打卡状态", notes = "")
    @PostMapping("/FindClockstatus")
    public Staff FindClockstatus(@RequestBody Map map) {
        return staffService.FindClockstatus(map);
    }

    @ApiOperation(value = "根据id查询员工信息", notes = "")
    @PostMapping("/FindStaffById")
    public Staff FindStaffById(@RequestBody Map map) {
        return staffService.FindStaffById(map);
    }

    @ApiOperation(value = "App查询所有员工", notes = "")
    @PostMapping("/FindAllApp")
    public List<Staff> FindAllApp(@RequestBody Map map) {
        return staffService.FindAllApp(map);
    }
}
