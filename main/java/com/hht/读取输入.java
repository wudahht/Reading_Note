package com.hht;
import java.io.Console;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class 读取输入 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.println("name? :");
        String name = in.nextLine();

        // get second input
        System.out.println("age? :");
        int age = in.nextInt();

        // display on console
        System.out.println("hello"+name+".Next year, you'll be "+(age+1));


        // 因为输入是可见的，所以Scanner类不适用于从控制台读取密码。
        // 想要读取密码，可以采用下列代码

        //Console console = System.console();
        //String username = console.readLine("username:");
        //char[] passwd = console.readPassword("Password:");

        // 对文件进行读取
        //Scanner scanner = new Scanner(Paths.get("file.txt"),"UTF-8");
        // 写入文件
        //PrintWriter printWriter = new PrintWriter("file.txt", "UTF-8");


    }

}
