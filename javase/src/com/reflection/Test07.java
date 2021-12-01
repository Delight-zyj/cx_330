package com.reflection;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器 --》 扩展类加载器
        ClassLoader systemClassLoaderParent = systemClassLoader.getParent();
        System.out.println(systemClassLoaderParent);

        //获取扩展类加载器的父类加载器--》根加载器（C/C++)
        ClassLoader systemClassLoaderParentParent = systemClassLoaderParent.getParent();
        System.out.println(systemClassLoaderParentParent);

        //测试当前类是哪个加载器加载的
        ClassLoader test07Class = Test07.class.getClassLoader();
        System.out.println(test07Class);
        ClassLoader classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载类的路径
        System.out.println(System.getProperty("java.class.path"));

        /*
        E:\Java\jdk1.8.0_191\jre\lib\charsets.jar;
        E:\Java\jdk1.8.0_191\jre\lib\deploy.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;
        E:\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;
        E:\Java\jdk1.8.0_191\jre\lib\javaws.jar;
        E:\Java\jdk1.8.0_191\jre\lib\jce.jar;
        E:\Java\jdk1.8.0_191\jre\lib\jfr.jar;
        E:\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;
        E:\Java\jdk1.8.0_191\jre\lib\jsse.jar;
        E:\Java\jdk1.8.0_191\jre\lib\management-agent.jar;
        E:\Java\jdk1.8.0_191\jre\lib\plugin.jar;
        E:\Java\jdk1.8.0_191\jre\lib\resources.jar;
        E:\Java\jdk1.8.0_191\jre\lib\rt.jar;
        E:\学习\JavaSE\javase\out\production\javase;
        C:\Users\Administrator\.m2\repository\junit\junit\4.12\junit-4.12.jar;
        C:\Users\Administrator\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;
        C:\Program Files\JetBrains\IntelliJ IDEA 2020.1\lib\idea_rt.jar
         */
    }
}
