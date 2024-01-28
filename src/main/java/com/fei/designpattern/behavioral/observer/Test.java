package com.fei.designpattern.behavioral.observer;

public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexObserver(subject);

        System.out.println("状态值为 : 15");
        subject.setState(15);

        System.out.println("状态值为 : 8");
        subject.setState(8);

    }
}
