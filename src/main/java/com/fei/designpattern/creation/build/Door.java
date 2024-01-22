package com.fei.designpattern.creation.build;

public class Door {
    private String value;

    public Door() {
    }

    @Override
    public String toString() {
        return value;
    }

    public Door(String value) {
        this.value = value;
    }


}
