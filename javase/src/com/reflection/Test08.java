package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class Test08 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.reflection.User");

        User user = new User();
        c1 = user.getClass();

        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        //获得类的属性
        System.out.println("=============获得类的属性=================");
        Field[] fields = c1.getFields();  //只能找到public属性
        fields = c1.getDeclaredFields();  //找到全部的属性
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("===============获得类的方法==================");
        Method[] methods = c1.getMethods();//获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的 = " + method);
        }
        methods = c1.getDeclaredMethods(); //获得本类的所有方法
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("===============获得指定方法==================");
        Method getNames = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getNames);
        System.out.println(setName);

        System.out.println("===============获得所有构造器==================");
        Constructor<?>[] constructors = c1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        constructors = c1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("##constructo## = " + constructor);
        }

        System.out.println("===============获得指定构造器==================");
        Constructor constructor = c1.getConstructor(String.class, int.class, int.class);
        System.out.println(constructor);

    }
}
