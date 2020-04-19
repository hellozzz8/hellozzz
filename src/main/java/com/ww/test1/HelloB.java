package com.ww.test1;

public class HelloB extends HelloA {
    public HelloB(){

    }
    {
        System.out.println("B 的class");
    }
    static {
        System.out.println("b 的静态代码块");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
