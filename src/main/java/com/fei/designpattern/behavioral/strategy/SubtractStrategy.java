package com.fei.designpattern.behavioral.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
