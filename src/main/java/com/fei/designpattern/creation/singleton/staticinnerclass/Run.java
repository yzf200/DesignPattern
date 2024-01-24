package com.fei.designpattern.creation.singleton.staticinnerclass;

public class Run implements Runnable{
    @Override
    public void run() {
        System.out.println(StaticInnerClassSingleton.getInstance());
    }
}
