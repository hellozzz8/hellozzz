package com.ww.test1;

public class Main {
    public static void main(String[] args) {
        System.out.println(fun1());
    }
    public static String fun1 (){
        try {
            System.out.print("A");
            return fun2();
        }finally {
            System.out.print("B");
        }
    }

    public static String fun2(){
        System.out.print("C");
        return "D";
    }

}
