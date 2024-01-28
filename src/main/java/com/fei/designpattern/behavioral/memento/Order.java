package com.fei.designpattern.behavioral.memento;

//备忘录
public class Order {
    private String state;

    public String getState() {
        return state;
    }

    public Order(String state) {
        this.state = state;
    }
}
