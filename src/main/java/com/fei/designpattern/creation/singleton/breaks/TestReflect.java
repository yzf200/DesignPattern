package com.fei.designpattern.creation.singleton.breaks;

import com.fei.designpattern.creation.singleton.enumsingleton.EnumSingleton;
import com.fei.designpattern.creation.singleton.lazy.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        LazySingleton singleton = LazySingleton.getInstance();
        EnumSingleton singleton = EnumSingleton.EnumSingleton;
        Class clazz = singleton.getClass();

        Constructor constructor = clazz.getDeclaredConstructor();

        //强制开启权限
        constructor.setAccessible(true);
        EnumSingleton instance = (EnumSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(singleton);
        System.out.println(instance == singleton);
    }
}
