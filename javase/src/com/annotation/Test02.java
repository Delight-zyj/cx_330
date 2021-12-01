package com.annotation;

import java.lang.annotation.*;

//测试元注解
public class Test02 {
    @MyAnnotation
        public void test() {

        }

    public static void main(String[] args) {
        Test02 t = new Test02();
        t.test();
    }
}

//定义一个注解
//Target标识注解可以用在那些地方
@Target(value={ElementType.METHOD,ElementType.TYPE})
//表示我们注解在什么地方有效  runtime 》 class 》 sources
@Retention(RetentionPolicy.RUNTIME)
//Document 表示是否将我们的注解生成在Javadoc中
@Documented

//Inherited 子类可以继承父类注解
@Inherited
@interface MyAnnotation{

}
