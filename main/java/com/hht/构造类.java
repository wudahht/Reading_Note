package com.hht;

import java.util.Date;

public class 构造类 {
    public static void main(String[] args) {
        Date birthday = new Date();
        String s = birthday.toString();
        if(s != null || s != ""){ System.out.println(s);}
    }

}
