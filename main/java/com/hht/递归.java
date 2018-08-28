package com.hht;

public class 递归 {
    public int fact(int n){
        int res;
        if(n == 0){return 1;}
        if(n == 1){return 1;}
        res = fact(n-1) * n;
        return res;
    }

    public static void main(String[] args) {
        递归 f = new 递归();
        System.out.println("Factorial of 3 is: "+f.fact(3));
        System.out.println("Factorial of 4 is: "+f.fact(4));
    }
}
