package com.ww.test1;

public class B extends A {
    public B (){
        System.out.println("B2");
    }
    {System.out.println("B2");}
    static {
        System.out.println("B3");
    }

    public static void main(String[] args) {
        new B();
    }
}
