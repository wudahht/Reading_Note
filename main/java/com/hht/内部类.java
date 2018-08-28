package com.hht;

public class 内部类 {
    int outer = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{ //内部类
        void display(){
            System.out.println("display:outer= "+outer);
            // 内部类可以访问外面的变量，即包围类的成员，也叫嵌套它的类的成员outer
        }
    }
}

class InnerClassDemo{
    public static void main(String[] args) {
        内部类 neibu = new 内部类();
        neibu.test();
    }
}