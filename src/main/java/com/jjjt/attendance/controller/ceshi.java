package com.jjjt.attendance.controller;


import com.jjjt.attendance.service.RegistrationService;
import com.jjjt.attendance.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ceshi {
    public static void main(String args[]) throws ParseException {

        /*String id = "356923199104260322";
        String lastWord = id.substring(id.length() - 1);
        String reg = "[a-zA-Z]";
        if (lastWord.matches(reg)) {
            String s = id.substring(id.length() - 7, id.length() - 1);
            System.out.println("略过字母：" + s);
        } else {
            System.out.println(id.substring(id.length() - 6));
        }*/

        //时间毫秒数测试
        /*long t1=System.currentTimeMillis();
        System.out.println("当前时间毫秒数:"+t1);
        System.out.println("<------------------------------>");*/

        /*Date date=new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String fmDate=simpleDateFormat.format(date);
        System.out.println(fmDate);
        long time1=simpleDateFormat.parse(fmDate).getTime();
        System.out.println(time1);
        String in_time = "09:26:50";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");//24小时制
        long time = simpleDateFormat1.parse(in_time).getTime();//获取固定时间的毫秒数
        System.out.println(time);

        long current = System.currentTimeMillis();//当前时间毫秒数
        System.out.println(current);
        long zero = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
        System.out.println(zero);

        System.out.println(current>zero);*/


        /*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
        Date date = format.parse(time);
        //日期转时间戳（毫秒）
        long times = date.getTime();*/

        /*Date date = new Date();
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        System.out.println(weekDays[w]);*/


        /*Date datez = new Date();
        SimpleDateFormat simpleDateFormatz = new SimpleDateFormat("HH:mm:ss");
        String fmDatez = simpleDateFormatz.format(datez);
        long time1z = simpleDateFormatz.parse(fmDatez).getTime();
        //从对象中拿到时间
        String in_timez = "15:05:50";
        long createTime = simpleDateFormatz.parse(in_timez).getTime();
        long diff=(time1z-createTime)/1000/60;
        System.out.println(diff);*/



        /*TimeUtils timeUtils = new TimeUtils();
        String time="1586966400000";
        System.out.println(timeUtils.toDate(time));


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(timeUtils.toDate(time), formatter);

        System.out.println("Year: " + ldt.getYear());
        System.out.println("Month: " + ldt.getMonth().getValue());
        System.out.println("DayOfMonth: " + ldt.getDayOfMonth());*/

        String s = "1590043455000";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date1 = new Date(lt);
        String res = simpleDateFormat.format(date1);
        System.out.println("res:" + res);
    }
}
