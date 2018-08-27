package com.hht;

//实现一个整数堆栈
public class stack {
    int[] stck = new int[10];
    int pos;

    //Initial the top of stack
    stack(){
        pos = -1;
    }

    //push压栈
    void push(int item){
        if(pos == 9){
            System.out.println("full!");
        }
        else { stck[++pos] = item; }
    }

    //pop出栈
    int pop(){
        if(pos < 0){
            System.out.println("empty!");
            return 0;
        }
        else { return stck[pos--]; }
    }

}
