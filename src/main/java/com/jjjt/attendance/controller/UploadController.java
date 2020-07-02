package com.jjjt.attendance.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

@Api(description = "图片接口")
@RestController
@RequestMapping("img")
@CrossOrigin
public class UploadController {
    @ApiOperation(value = "上传图片", notes = "")
    @PostMapping("upload")
    public String picture(@RequestParam("file") MultipartFile file) {
        String oldFileName = file.getOriginalFilename();
        int lastDotIndex = oldFileName.lastIndexOf(".");
        String extName = oldFileName.substring(lastDotIndex);
        String newName = UUID.randomUUID() + extName;
        File excelFile =
                new File("E:/test/"//   /root/img/    E:/test/
                        + newName);
        try {
            file.transferTo(excelFile);
            return newName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "false";
    }

    @ApiOperation(value = "下载图片", notes = "测试数据:{\"img_url\":\"安全行为之星系统.pdf\"}")
    @GetMapping("/download_img")
    public void find_img(@RequestParam String img_url, HttpServletResponse response) {
        System.out.println(img_url);
        try {
            BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File("E:/test/" + img_url)));//   /root/img/    E:/test/
            int num;
            byte[] b = new byte[1024];

            while ((num = bis.read(b)) != -1) {
                response.getOutputStream().write(b, 0, num);
            }
            response.getOutputStream().flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
