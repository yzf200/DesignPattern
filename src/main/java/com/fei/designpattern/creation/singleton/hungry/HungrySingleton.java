package com.fei.designpattern.creation.singleton.hungry;

public class HungrySingleton {

    private static final HungrySingleton hungrySingleton ;
    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        System.out.println("HungrySingleton初始化.....");
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
