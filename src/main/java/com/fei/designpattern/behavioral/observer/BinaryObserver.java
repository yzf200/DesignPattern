package com.fei.designpattern.behavioral.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.binding(this);
    }

    @Override
    public void update() {
        System.out.println(
                "Binary String : "
                +
                Integer.toBinaryString(subject.getState())
        );
    }
}
