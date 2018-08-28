package com.hht;

public class 访问控制 {
    public int a;
    protected int b;
    private int c;

    访问控制(int aa, int bb, int cc){
        a = aa;
        b = bb;
        c = cc;
    }

    // access data method
    void setdata(int aaa, int bbb, int ccc){
        a = aaa;
        b = bbb;
        c = ccc;
    }

    int getA(){
        return a;
    }

    int getB(){
        return b;
    }

    int getC(){
        return c;
    }
}

//public class Test {
//    public static void main(String[] args) {
//        //建立一个对象
//        访问控制 test = new 访问控制(1,2,3);
//
//        System.out.println(test.a+" "+test.b+" "+test.c);
//        test.a = 11;
//        test.b = 22;
//        test.c = 33;
//        System.out.println(test.a+" "+test.b+" "+test.c);
//        test.setdata(12,13,14);
//        System.out.println(test.a+" "+test.b+" "+test.c);
//
//    }

//}
