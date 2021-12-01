package com.se;

import org.junit.Test;

public class CharacterT {
    @Test
    public void characterTest(){
        char ch = 'a';
        char uniChar = '\u029A';
        char [] charArray = {'a','b','c','d'};

        System.out.println(ch);
        System.out.println(uniChar);
        System.out.println(charArray);
        Character character = new Character('a');
    }


    /**
     * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
     * 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被
     * 多次的修改，并且不产生新的未使用对象。
     */
    @Test
    public void stringTest(){
        //String 会创建一个新的对象
        //StringBuilder 速度快线程不安全 ,在没有要求线程安全的时候用StringBuilder
        //StringBuffer 线程安全 速度相对比较慢
        StringBuilder sb = new StringBuilder(10);
        sb.append("0123456789");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8,"java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);
    }

    /**
     * Java 语言中提供的数组是用来存储固定大小的同类型元素。
     *
     * dataType[] arrayRefVar;   // 首选的方法
     * dataType arrayRefVar[];  // 效果相同，但不是首选方法
     *
     * 三种创建方式：
     * arrayRefVar = new dataType[arraySize];
     * dataType[] arrayRefVar = new dataType[arraySize];
     * dataType[] arrayRefVar = {value0, value1, ..., valuek };
     */
    @Test
    public void Array(){
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);
    }


}
