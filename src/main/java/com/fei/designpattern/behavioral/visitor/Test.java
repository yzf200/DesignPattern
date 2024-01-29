package com.fei.designpattern.behavioral.visitor;

public class Test {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerDisplayVisitor());
    }
}
