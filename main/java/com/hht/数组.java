package com.hht;

import java.util.Arrays;
import java.util.Scanner;

public class 数组 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers?");
        int k = scanner.nextInt();

        System.out.println("the highest number:");
        int n = scanner.nextInt();

        int[] number = new int[n];
        for(int i=0;i<number.length;i++){
            number[i] = i+1;
        }

        for(int i:number){
            System.out.print(i+" ");
        }

        System.out.println();

        int res[] = new int[k];
        for(int i = 0; i<res.length; i++){
            int r = (int)(Math.random()*n);
            System.out.println("r = "+r);
            res[i] = number[r];

            //move the last element into the random location
            number[r] = number[n-1];
            n--;
        }

        for(int i:number){
            System.out.print(i+" ");
        }

        System.out.println();

        Arrays.sort(res);
        for(int r:res){
            System.out.print(r+" ");
        }
    }
}
