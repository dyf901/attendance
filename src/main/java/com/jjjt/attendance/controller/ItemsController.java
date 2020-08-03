package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.Items;
import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.entity.Staff;
import com.jjjt.attendance.service.ClientService;
import com.jjjt.attendance.service.ItemsService;
import com.jjjt.attendance.service.StaffItemsService;
import com.jjjt.attendance.service.StaffService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;

@Api(description = "客户接口")
@RestController
@RequestMapping("Items")
@CrossOrigin
public class ItemsController {
    @Autowired
    private StaffService staffService;

    @Autowired
    private ItemsService itemsService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private StaffItemsService staffItemsService;

    @ApiOperation(value = "增加客户信息", notes = "conglomerate_id,staff_id,items_name,bloc_name,type,uptime,uptimeC,client_name,client_sex,client_position,client_department,client_phone")
    @PostMapping("/InsertItems")
    public JsonResult InsertItems(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        Items items = new Items();
        //增加客户信息
        long uptimeC = (long) map.get("uptimeC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lts = new Long(uptimeC);
        Date date2 = new Date(lts);
        String uptime = simpleDateFormat.format(date2);
        items.setConglomerate_id((Integer) map.get("conglomerate_id"));
        items.setStaff_id((Integer) map.get("staff_id"));
        items.setItems_name((String) map.get("items_name"));
        items.setBloc_name((String) map.get("bloc_name"));
        items.setType((String) map.get("type"));
        items.setUptime(uptime);
        items.setUptimeC((Long) map.get("uptimeC"));
        int i = itemsService.InsertItems(items);
        if (i == 1) {
            System.out.println("返回id:" + items.getId());
            String client_name = (String) map.get("client_name");
            if (client_name.equals("")) {
                map.put("items_id", items.getId());
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                String time = format.format(now);
                map.put("uptime",time);
                staffItemsService.InsertStaffItems(map);
                jsonResult.setCode(200);
                jsonResult.setMessage("客户添加成功,暂无联系人!");
                return jsonResult;
            } else {
                map.put("items_id", items.getId());
                int l = clientService.InsertClient(map);
                if (l == 1) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date now = new Date();
                    String time = format.format(now);
                    map.put("uptime",time);
                    staffItemsService.InsertStaffItems(map);
                    jsonResult.setCode(200);
                    jsonResult.setMessage("客户添加成功,联系人已添加");
                    return jsonResult;
                } else {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date now = new Date();
                    String time = format.format(now);
                    map.put("uptime",time);
                    staffItemsService.InsertStaffItems(map);
                    jsonResult.setCode(20006);
                    jsonResult.setMessage("客户添加成功,联系人添加失败!");
                    return jsonResult;
                }
            }
        }

        //判断
        return jsonResult;
    }

    @ApiOperation(value = "删除客户", notes = "")
    @PostMapping("/DeleteItems")
    public boolean DeleteItems(@RequestBody Map map){
        return itemsService.DeleteItems(map)==1;
    }

    @ApiOperation(value = "分页查询客户信息", notes = "")
    @PostMapping("/FindItems")
    public Page FindItems(@RequestBody Map map) {
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(itemsService.Total(map));
        page.setItems(itemsService.FindItems(map));
        return page;
    }

    @ApiOperation(value = "App查询客户信息", notes = "传参:staff_id,conglomerate_id")
    @PostMapping("/FindItemsApp")
    public JsonResult FindItemsApp(@RequestBody Map map) {
        System.out.println(map);
        JsonResult jsonResult = new JsonResult();
        map.put("id", map.get("staff_id"));
        Staff staff = staffService.FindStaffById(map);
        System.out.println(staff);
        if (staff.getPosition_name().equals("管理员") || staff.getPosition_name().equals("市场总监")) {
            System.out.println(itemsService.FindItemsApp(map));
            jsonResult.setData(itemsService.FindItemsApp(map));
            return jsonResult;
        } else {
            List lista = new ArrayList();
            List<Integer> list = staffItemsService.FindItemsId(map);
            System.out.println(list);
            for (Integer l : list) {
                lista.add(itemsService.FindItemsById(l));
            }
            jsonResult.setData(lista);
            return jsonResult;
        }
    }

    @ApiOperation(value = "App查询客户信息", notes = "传参:staff_id,conglomerate_id")
    @PostMapping("/FindItemsAppB")
    public JsonResult FindItemsAppB(@RequestBody Map map) {
        System.out.println(map);
        JsonResult jsonResult = new JsonResult();
        map.put("id", map.get("staff_id"));
        Staff staff = staffService.FindStaffById(map);
        System.out.println(staff);
        if (staff.getPosition_name().equals("管理员") || staff.getPosition_name().equals("市场总监")) {
            System.out.println(itemsService.FindItemsApp(map));
            jsonResult.setData(itemsService.FindItemsAppB(map));
            return jsonResult;
        } else {
            List lista = new ArrayList();
            List<Integer> list = staffItemsService.FindItemsId(map);
            System.out.println(list);
            for (Integer l : list) {
                lista.add(itemsService.FindItemsByIdB(l));
            }
            jsonResult.setData(lista);
            return jsonResult;
        }
    }

    @ApiOperation(value = "推送客户", notes = "传参:staff_id(被推送人的id,滚动选择),items_id(客户id)")
    @PostMapping("/PushItems")
    public JsonResult PushItems(@RequestBody Map map) {
        JsonResult jsonResult = new JsonResult();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        map.put("uptime",time);
        int i = staffItemsService.InsertStaffItems(map);
        if (i == 1) {
            itemsService.UpdateItemsByStaffId(map);
            jsonResult.setCode(200);
            jsonResult.setMessage("推送成功!");
            return jsonResult;
        } else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("推送失败!");
            return jsonResult;
        }
    }
}
