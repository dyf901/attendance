package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Examine;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.ExamineService;
import com.jjjt.attendance.service.StaffExamineService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Api(description = "审批接口")
@RestController
@RequestMapping("Examine")
@CrossOrigin
public class ExamineController {
    @Autowired
    private ExamineService examineService;

    @Autowired
    private StaffExamineService staffExamineService;

    @Autowired
    private StaffService staffService;

    @ApiOperation(value = "新建审批", notes = "")
    @PostMapping("/InsertExamine")
    public JsonResult InsertExamine(@RequestBody Map map) throws ParseException {
        System.out.println("map:"+map);
        JsonResult jsonResult = new JsonResult();
        Examine examine = new Examine();
        examine.setStaff_id((Integer) map.get("staff_id"));
        examine.setItmes_id((Integer) map.get("itmes_id"));
        examine.setCompany_id((Integer) map.get("company_id"));
        examine.setConglomerate_id((Integer) map.get("conglomerate_id"));
        examine.setExamine_type((String) map.get("examine_type"));
        examine.setContent((String) map.get("content"));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        examine.setUptimeC(times);
        examine.setUptime(time);
        if (map.get("examine_type").equals("出差")) {
            long outtimeC = (long) map.get("outtimeC");
            long intimeC = (long) map.get("intimeC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(outtimeC);
            Date date1 = new Date(lt);
            long lts = new Long(intimeC);
            Date date2 = new Date(lts);
            String outtime = simpleDateFormat.format(date1);
            String intime = simpleDateFormat.format(date2);
            examine.setOuttime(outtime);
            examine.setIntime(intime);
            examine.setOutaddress((String) map.get("outaddress"));
            examine.setIntimeC((Long) map.get("intimeC"));
            examine.setOuttimeC((Long) map.get("outtimeC"));

        } else if (map.get("examine_type").equals("请假")) {
            long start_timeC = (long) map.get("start_timeC");
            long end_timeC = (long) map.get("end_timeC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(start_timeC);
            Date date1 = new Date(lt);
            long lts = new Long(end_timeC);
            Date date2 = new Date(lts);
            String start_time = simpleDateFormat.format(date1);
            String end_time = simpleDateFormat.format(date2);
            examine.setStart_time(start_time);
            examine.setEnd_time(end_time);
            examine.setStart_timeC((long) map.get("start_timeC"));
            examine.setEnd_timeC((long) map.get("end_timeC"));

        } else if (map.get("examine_type").equals("报销")){
            examine.setExpenses_type((String) map.get("expenses_type"));
            examine.setExpenses_sum((Double) map.get("expenses_sum"));
            examine.setExpenses_picture((String) map.get("expenses_picture"));

        } else if (map.get("examine_type").equals("采购")){
            examine.setProcurement_type((String) map.get("procurement_type"));
            examine.setProcurement_sum((Double) map.get("procurement_sum"));

        } else if (map.get("examine_type").equals("转正")) {
            long entry_timeC = (long) map.get("entry_timeC");
            long promotion_timeC = (long) map.get("promotion_timeC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(entry_timeC);
            Date date1 = new Date(lt);
            long lts = new Long(promotion_timeC);
            Date date2 = new Date(lts);
            String entry_time = simpleDateFormat.format(date1);
            String promotion_time = simpleDateFormat.format(date2);
           // System.out.println(entry_time);
            //System.out.println(promotion_time);
            examine.setEntry_time(entry_time);
            examine.setPromotion_time(promotion_time);
            examine.setEntry_timeC((long) map.get("entry_timeC"));
            examine.setPromotion_timeC((long) map.get("promotion_timeC"));
            examine.setOperating_post((String) map.get("operating_post"));
        }

        int i = examineService.InsertExamine(examine);
        if (i == 1) {
            String list= (String) map.get("list");
            JSONArray jsonArray = JSONArray.fromObject(list);
            for (int s=0;s<jsonArray.size();s++){
                System.out.println("json:"+jsonArray.get(s));
                map.put("examine_id",examine.getId());
                map.put("staff_idT",jsonArray.get(s));
                staffExamineService.InsertStaffExamine(map);
            }
            jsonResult.setCode(200);
            jsonResult.setMessage("提交成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("提交失败!");
            return jsonResult;
        }
    }


   /* @ApiOperation(value = "新建审批", notes = "")
    @PostMapping("/InsertExamine")
    public JsonResult InsertExamine(Examine examine) throws ParseException {
        JsonResult jsonResult = new JsonResult();
        Map map = new HashMap();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();
        *//*map.put("uptimeC", times);
        map.put("uptime", time);*//*
        examine.setUptimeC(times);
        examine.setUptime(time);
        if (examine.getExamine_type().equals("出差")) {
            long outtimeC = examine.getOuttimeC();
            long intimeC = examine.getIntimeC();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(outtimeC);
            Date date1 = new Date(lt);
            long lts = new Long(intimeC);
            Date date2 = new Date(lts);
            String outtime = simpleDateFormat.format(date1);
            String intime = simpleDateFormat.format(date2);
            *//*map.put("outtime", outtime);
            map.put("intime", intime);*//*
            examine.setOuttime(outtime);
            examine.setIntime(intime);
        } else if (examine.getExamine_type().equals("请假")) {
            long start_timeC = examine.getStart_timeC();
            long end_timeC = examine.getEnd_timeC();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = new Long(start_timeC);
            Date date1 = new Date(lt);
            long lts = new Long(end_timeC);
            Date date2 = new Date(lts);
            String start_time = simpleDateFormat.format(date1);
            String end_time = simpleDateFormat.format(date2);
            *//*map.put("start_time", start_time);
            map.put("end_time", end_time);*//*
            examine.setStart_time(start_time);
            examine.setEnd_time(end_time);
        }
        int i = examineService.InsertExamine(examine);
        if (i == 1) {
            String list= (String) map.get("list");
            JSONArray jsonArray = JSONArray.fromObject(list);
            for (int s=0;s<jsonArray.size();s++){
                System.out.println(jsonArray.get(s));
                map.put("examine_id",examine.getId());
                map.put("staff_idT",jsonArray.get(s));
                staffExamineService.InsertStaffExamine(map);
            }
            jsonResult.setCode(200);
            jsonResult.setMessage("提交成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("提交失败!");
            return jsonResult;
        }
    }*/

    @ApiOperation(value = "删除审批", notes = "")
    @PostMapping("/DeleteExamine")
    public boolean DeleteExamine(@RequestBody Map map) {
        return examineService.DeleteExamine(map) == 1;
    }

    @ApiOperation(value = "分页查询审批信息", notes = "")
    @PostMapping("/FindExamine")
    public Page FindExamine(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examineService.Total(map));
        page.setItems(examineService.FindExamine(map));
        return page;
    }

    @ApiOperation(value = "查询个人审批记录", notes = "传参:staff_id(登录返回id),pageNo,pageSize,examine_type(请假,审批,加班,报销)")
    @PostMapping("/FindExamineByStaffId")
    public Page FindExamineByStaffId(@RequestBody Map map) {
        System.out.println("map" + map);
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(examineService.TotalByStaffId(map));
        page.setItems(examineService.FindExamineByStaffId(map));
        return page;
    }

    @ApiOperation(value = "审核通过", notes = "")
    @PostMapping("/UpdateStateT")
    public JsonResult UpdateStateT(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        Examine examine = examineService.FindExamineById(map);
        System.out.println("examine:"+examine);

        int i = examineService.UpdateStateT(map);

        if(i==1){
            //判断是否是转正审批,是则修改员工信息中的转正时间不是则直接忽略
            if(examine.getExamine_type().equals("转正")){
                long promotion_timeC = examine.getPromotion_timeC();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long lts = new Long(promotion_timeC);
                Date date2 = new Date(lts);
                String promotion_time = simpleDateFormat.format(date2);
                map.put("promotion_time",promotion_time);
                map.put("staff_id",examine.getStaff_id());
                staffService.UpdatePromotionTime(map);
            }

            jsonResult.setCode(200);
            jsonResult.setMessage("审核成功");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("审核失败");
        }
        return jsonResult;
    }

    @ApiOperation(value = "审核未通过", notes = "")
    @PostMapping("/UpdateStateW")
    public JsonResult UpdateStateW(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        int i = examineService.UpdateStateW(map);
        if(i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("审核成功");
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("审核失败");
        }
        return jsonResult;
    }

    @ApiOperation(value = "根据id查询详细审批信息", notes = "传参:id(每条记录对应的id)")
    @PostMapping("/FindExamineById")
    public Examine FindExamineById(@RequestBody Map map) {
        return examineService.FindExamineById(map);
    }

    @ApiOperation(value = "查询由我审批的审批信息", notes = "传参:staff_id,state(状态:未审核,通过,未通过),pageNo,pageSize,examine_type(请假,审批,加班,报销)")
    @PostMapping("FindExamineByY")
    public Page FindExamineByY(@RequestBody Map map) {
        Page page = new Page();
        List<Integer> list = staffExamineService.FindExamineId(map);//根据staff_id查询对应的审批信息id
        System.out.println("list:" + list);
        List list1 = new ArrayList();
        for (Integer l : list) {
            map.put("id", l);
            System.out.println("详细信息:" + examineService.FindExamineByIdApp(map));
            if(examineService.FindExamineByIdApp(map)==null){

            }else {
                list1.add(examineService.FindExamineByIdApp(map));
            }
        }
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(staffExamineService.Total(map));
        page.setItems(list1);
        return page;
    }
}
