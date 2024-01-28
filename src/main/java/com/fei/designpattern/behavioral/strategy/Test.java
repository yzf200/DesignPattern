package com.fei.designpattern.behavioral.strategy;

public class Test {

    public static void main(String[] args) {
        Operation operation1 = new Operation(new AddStrategy());
        System.out.println("10 + 5 = "+operation1.execute(10,5));

        Operation operation2 = new Operation(new SubtractStrategy());
        System.out.println("10 - 5 = "+operation2.execute(10,5));

        Operation operation3 = new Operation(new MultiplyStrategy());
        System.out.println("10 * 5 = "+operation3.execute(10,5));

    }
}
