package com.jjjt.attendance.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
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

        Date date=new Date();
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

        System.out.println(current>zero);
    }
}
