package com.fei.designpattern.behavioral.observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.binding(this);
    }

    @Override
    public void update() {
        System.out.println(
                "Hex String : "
                +
                Integer.toHexString(subject.getState()).toUpperCase()
        );
    }
}
