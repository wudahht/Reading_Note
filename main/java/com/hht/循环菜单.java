package com.hht;

public class 循环菜单 {
    public static void main(String args[])
        throws java.io.IOException{
            char choice;

        do{
            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        }while(choice < '1'||choice >'5');

        System.out.println('\n');

        switch (choice){
            case '1':
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("switch(expression){");
                System.out.println("case constant");
                System.out.println("statement sequence");
                System.out.println("break;");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while:\n");
                break;
            case '4':
                System.out.println("The do-while:\n");
                break;
            case '5':
                System.out.println("The for:\n");
                break;

        }

    }
}
