package com.fei.designpattern.creation.singleton.doublecheck;

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Run());
        Thread thread2 = new Thread(new Run());

        thread1.start();
        thread2.start();

        System.out.println("main方法结束");

    }
}
