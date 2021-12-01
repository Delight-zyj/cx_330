package com.reflection;

public class Test05 {
    public static void main(String[] args) {
        A  a = new A();
        System.out.println(A.m);
    }
}

class A{

    static {
        System.out.println("我是静态代码块");
        m =300;
    }

    static int m =100;
    public A() {
        System.out.println("A类的无参构造器");
    }
}
