package com.ww.test1;

public class Test {
    static int x=10;

    static {
        System.out.println(x);
        x+=5;
        System.out.println(x);
    }

    public static void main(String[] args) {

            try{
                int a = 10/0;
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(111);
                System.out.println(e);
            }
            System.out.println(222);

    }
    static {
        System.out.println(x);
        x/=3;
        System.out.println(x);
    }
}
