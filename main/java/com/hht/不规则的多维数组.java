package com.hht;

public class 不规则的多维数组 {
    public static void main(String args[]){
        int month_days[][] = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                month_days[i][j] = k;
                k ++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(month_days[i][j]+" ");

            }
            System.out.println();

        }

    }
}
