package com.jjjt.attendance.controller;

import com.jjjt.attendance.entity.JsonResult;
import com.jjjt.attendance.service.FeedbackService;
import com.jjjt.attendance.util.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "反馈意见接口")
@RestController
@RequestMapping("Feedback")
@CrossOrigin
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @ApiOperation(value = "上传反馈意见",notes = "")
    @PostMapping("/InsertFeedback")
    public JsonResult InsertFeedback(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult();
        int i = feedbackService.InsertFeedback(map);
        if (i==1){
            jsonResult.setCode(200);
            jsonResult.setMessage("提交成功!");
            return jsonResult;
        }else {
            jsonResult.setCode(20006);
            jsonResult.setMessage("提交失败!");
            return jsonResult;
        }
    }

    @ApiOperation(value = "分页查询反馈信息",notes = "")
    @PostMapping("/FindFeedback")
    public Page FindFeedback(@RequestBody Map map){
        Page page = new Page();
        page.setPageNo((Integer) map.get("pageNo"));
        page.setPageSize((Integer) map.get("pageSize"));
        page.setTotal(feedbackService.Total());
        page.setItems(feedbackService.FindFeedback(map));
        return page;
    }
}
