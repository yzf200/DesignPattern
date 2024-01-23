package com.fei.designpattern.creation.singleton.lazy;

public class Run implements Runnable{
    @Override
    public void run() {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);
    }
}
