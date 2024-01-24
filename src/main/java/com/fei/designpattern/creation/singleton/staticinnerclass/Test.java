package com.fei.designpattern.creation.singleton.staticinnerclass;

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Run());
        Thread thread2 = new Thread(new Run());
        Thread thread3 = new Thread(new Run());

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Main进程结束");
    }
}
