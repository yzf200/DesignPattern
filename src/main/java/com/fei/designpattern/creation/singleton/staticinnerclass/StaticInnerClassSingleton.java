package com.fei.designpattern.creation.singleton.staticinnerclass;

public class StaticInnerClassSingleton {

    /**
     * 第一次被调用到的时候才会进行类加载，进行初始化（JVM相关知识，加载、连接（验证，准备，解析）、初始化（为静态变量赋值）
     */
    private static class InnerClass{
        private static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){
        System.out.println("StaticInnerClassSingleton初始化......");
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
