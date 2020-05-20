package com.jjjt.attendance.util;

import com.jjjt.attendance.dao.StaffDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class QuartzUtil {
    @Autowired
    private StaffDao staffDao;

    //每分钟启动
    @Scheduled(cron = "0 0 6 * * ?")
    //cron = "0 0 0 */1 * ?"每天零时启动
    //0 0 6 * * ? 每天早上六点执行
    public void timerToNow() {
        staffDao.UpdateClockstatus();
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println("已经执行了!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

}
