package com.jjjt.attendance.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
     * 3:假定作业的命名要求是中文姓名+压缩文件名，可以是zip或者rar,比如张洋.rar或者张洋.zip都是对的，其他，比如zhangyang.rar或zhangyang.java都是错误的。
     * 输入作业名称，判断是否正确
     */
    public class Claim {
        public static void main(String[] args) {
           /* System.out.println("请输入作业名:");
            Scanner in = new Scanner(System.in);
            String ar = in.next();
            System.out.println(ar.substring(ar.length() - 4));
            String as=ar.substring(ar.length() - 4);
            if (as.equalsIgnoreCase(".zip")){
                int temp = 0;
                String name = ar.substring(0,ar.indexOf("."));
                for (int i = 0; i <name.length() ; i++) {
                    int n = (int)name.charAt(i);
                    if (n<19968||n>=40869){
                        temp=1;
                    }
                }
                if (temp ==1){
                    System.out.println("不合格");
                }else {
                    System.out.println("合格！");
                }
            }*/

           Map map = new HashMap();
           map.put("1",1);
           Map m = new HashMap();
           m.put("2",map.get("1"));
           System.out.println(map.get("1"));
           System.out.println(m);
        }
    }