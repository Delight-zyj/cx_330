package com.annotation;

import java.util.ArrayList;
import java.util.List;

//什么是注解
public class Test01 extends Object{
    @Override //重写的注解   必须要重写父类方法
    public String toString() {
        return super.toString();
    }

    //Deprecated 不推荐使用 但是可以使用 或者有更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    //镇压警告  取值范围为：
    @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList<>();
    }

    public static void main(String[] args) {
        Test01.test();
    }




}
