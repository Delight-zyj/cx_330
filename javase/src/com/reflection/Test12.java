package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.reflection.Student2");

        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation = " + annotation);
        }

        //获取注解Value的值
        Tablekuang tablekuang = (Tablekuang) c1.getAnnotation(Tablekuang.class);
        String value = tablekuang.value();
        System.out.println("value = " + value);

        //获取指定类的注解
        Field f = c1.getDeclaredField("name");
        Filedkuang annotation = f.getAnnotation(Filedkuang.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}




@Tablekuang("db_student")
class Student2{
    @Filedkuang(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Filedkuang(columnName = "db_age",type = "int",length = 10)
    private int age;
    @Filedkuang(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


//类名的注解
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Tablekuang{
    String value();
}


//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filedkuang{
    String columnName();
    String type();
    int length();
}
