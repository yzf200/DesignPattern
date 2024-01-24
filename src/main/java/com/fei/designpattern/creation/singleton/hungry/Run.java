package com.fei.designpattern.creation.singleton.hungry;

public class Run implements Runnable{
    @Override
    public void run() {
        System.out.println(HungrySingleton.getInstance());
    }
}
