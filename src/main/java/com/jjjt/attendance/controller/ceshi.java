package com.jjjt.attendance.controller;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ceshi {
    public static void main(String args[]) {
        String id = "356923199104260322";
        String lastWord = id.substring(id.length() - 1);
        String reg = "[a-zA-Z]";
        if (lastWord.matches(reg)) {
            String s = id.substring(id.length() - 7, id.length() - 1);
            System.out.println("略过字母：" + s);
        } else {
            System.out.println(id.substring(id.length() - 6));
        }

    }
}
