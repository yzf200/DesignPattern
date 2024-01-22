package com.fei.designpattern.creation.build;

public class BasePlate {
    private String value;

    public BasePlate() {
    }

    @Override
    public String toString() {
        return value;
    }

    public BasePlate(String value) {
        this.value = value;
    }
}
