package com.hht;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        //push some numbers
        for(int i=0;i<10;i++){ stack1.push(i);}
        for(int i=10;i<20;i++){ stack2.push(i);}

        //pop the numbers from stack
        System.out.println("stack1:");
        for(int i=0;i<10;i++){
            System.out.print(stack1.pop()+" ");}
        System.out.println();

        System.out.println("stack2:");
        for(int i=10;i<20;i++){
            System.out.print(stack2.pop()+" ");
        }
        System.out.println();
    }
}
