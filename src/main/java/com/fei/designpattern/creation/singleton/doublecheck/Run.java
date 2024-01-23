package com.fei.designpattern.creation.singleton.doublecheck;

import com.fei.designpattern.creation.singleton.lazy.LazySingleton;

public class Run implements Runnable{
    @Override
    public void run() {
        DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();
        System.out.println(singleton);
    }
}
