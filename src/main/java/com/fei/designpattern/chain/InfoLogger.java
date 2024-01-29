package com.fei.designpattern.chain;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO LOGGER :::>>> "+message);
    }
}
