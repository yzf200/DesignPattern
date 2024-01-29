package com.fei.designpattern.behavioral.visitor;

public class ComputerDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("组装完成 : 键盘 "+keyboard);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("组装完成 : 鼠标 "+mouse);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("组装完成 : 显示器 "+monitor);
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("组装完成 : 电脑 "+computer);
    }
}
