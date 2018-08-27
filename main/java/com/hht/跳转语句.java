package com.hht;

public class 跳转语句 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.println("i = "+i);
            for(int j=i;j<100;j++){
                if(j == 5){break;}
                if(j % 2 == 1){continue;}
                System.out.print("j = "+j+" ");
            }
            System.out.println();
        }
        System.out.println("loop is completed");
    }
}
