package com.jjjt.attendance.controller;

import com.jjjt.attendance.util.AliyunOSSUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Api(description = "阿里云oss图片接口")
@RestController
@RequestMapping("Ossimg")
@CrossOrigin
public class OssUploadController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UploadController.class);

    @ApiOperation(value = "任务图片上传" , notes = "")
    @PostMapping("/TaskUpload")
    public String CommodityUpload(MultipartFile file) {

        try {

            if (null != file) {
                String filename = file.getOriginalFilename();
                if (!"".equals(filename.trim())) {
                    File newFile = new File(filename);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    String Host = "task";
                    //上传到OSS
                    String uploadUrl = AliyunOSSUtil.upload(newFile, Host);
                    newFile.delete();
                    return uploadUrl;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "upload";
    }

}