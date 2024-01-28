package com.fei.designpattern.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
