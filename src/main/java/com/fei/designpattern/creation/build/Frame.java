package com.fei.designpattern.creation.build;

public class Frame {
    private String value;

    public Frame() {
    }

    @Override
    public String toString() {
        return value;
    }

    public Frame(String value) {
        this.value = value;
    }

}
