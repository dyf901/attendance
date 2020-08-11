package com.jjjt.attendance.controller;

public class StringText {
    public static void main(String[] strs){
        String text = " dai yi fei ";
        String text1 = "Daiyifei";

        //字符串反转
        // StringBuffer reverse
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer. append("abcdefg");
        System. out. println(stringBuffer. reverse()); // gfedcba
        // StringBuilder reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder. append("abcdefg");
        System. out. println(stringBuilder. reverse()); // gfedcba

        //返回指定字符的索引
        System.out.println(text.indexOf("i"));

        //返回指定索引处的字符
        System.out.println(text1.charAt(4));

        //字符串替换
        System.out.println(text1.replace("i","I"));

        //去除字符串两端空白
        System.out.println(text.trim());

        //分割字符串，返回一个分割后的字符串数组(分割后是一个数组,需要用循环去展示)
        for (String retval: text1.split("i")){
            System.out.println(retval);
        }

        //返回字符串的 byte 类型数组 ?????
        System.out.println(text1.getBytes());

        //返回字符串长度
        System.out.println(text1.length());
        System.out.println(text.length());

        //将字符串转成小写字母
        System.out.println(text1.toLowerCase());

        //将字符串转成大写字符
        System.out.println(text1.toUpperCase());

        //截取字符串(从0开始)
        System.out.println(text1.substring(3));//截取出从3后面的所有字符
        System.out.println(text1.substring(3,5));//截取从3到5的所有字符(不包含第五位)


    }
}