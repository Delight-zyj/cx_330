package com.day01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo01 {
    public static void main(String[] args) {
        int money = 10_0000_0000;
        int years = 20;
        int total =money * years;//-1474836480，计算的时候溢出了
        int total2 = money*years;//默认是int，转换之前就已经存在问题了
        System.out.println(money);
    }

}
