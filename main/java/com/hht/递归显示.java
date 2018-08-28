package com.hht;

public class 递归显示 {
    int[] values;

    //设置values的大小,调用构造函数
    递归显示(int n){
        values = new int[n];
    }

    public static void main(String[] args) {

        递归显示 p = new 递归显示(10);

        // 给数组values赋值，初始化
        for(int i=0; i<10; i++){
            p.values[i] = i;
        }

        //调用printA进行打印
        p.printA(p.values.length);


    }

    public void printA(int i){
        if(i==0){return;}  //在递归调用不执行的时候强制方法返回
        else{printA(i-1);}
        System.out.println("["+(i-1)+"]"+" "+values[i-1]);
    }
}
// 输出
/**
 * [0] 0
 * [1] 1
 * [2] 2
 * [3] 3
 * [4] 4
 * [5] 5
 * [6] 6
 * [7] 7
 * [8] 8
 * [9] 9
 */