package com.hht;

public class 位操作运算 {
    public static void main(String[] args) {
        char hex[] = {'0','1','2','3','4','5','6','7','8',
        '9','a','b','c','d','e','f'};

        byte b = (byte)0xf1;
        byte d = (byte)(b>>>4);
        System.out.println(d);
        System.out.println("0x"+hex[(d>>4)&0x0f]+hex[d&0x0f]);
    }
}

//使用无符号右移运算符>>>,实际上不是对byte进行直接操作而是将其扩大到int型后再进行处理
//比如0xf1，为负的byte型，二进制为1111 0001，采取b>>>4后，你可能期待得到0000 1111，然后却是1111 1111
//是因为在移动前0xf1已经被扩展到了int型，符号扩展位是负的，即11111111 11111111 11111111 11110001
//执行>>>4后，并转换为byte的8位，为1111 1111，即-1