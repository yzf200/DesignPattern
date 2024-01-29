package com.fei.designpattern.behavioral.visitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);

    }
}
