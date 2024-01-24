package com.fei.designpattern.creation.singleton.enumsingleton;

public class Test {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.EnumSingleton;
        EnumSingleton instance2 = EnumSingleton.EnumSingleton;
        System.out.println(instance2 == instance1);
        instance1.doSomething("做饭");
        instance2.doSomething("吃饭");
    }
}
