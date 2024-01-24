package com.fei.designpattern.creation.singleton.enumsingleton;

public enum EnumSingleton {
    EnumSingleton("枚举单例");

    private String name;

    EnumSingleton() {
    }

    EnumSingleton(String name) {
        this.name = name;
    }

    public void doSomething(String something) {
        System.out.println(name + ":" + something);
    }
}
