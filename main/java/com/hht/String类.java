package com.hht;

public class String类 {
    public static void main(String[] args) {
        String[] str = {"one","two","three"};
        int i=0;
        for(String s:str){
            System.out.println("str["+i+"]: "+s);
            i++;
        }
    }

}
