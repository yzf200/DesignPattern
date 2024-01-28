package com.fei.designpattern.behavioral.templatemethod;

public class DesignPatternClass extends AClass {

    private boolean flag;

    public DesignPatternClass(boolean flag) {
        this.flag = flag;
    }

    @Override
    protected boolean flag() {
        return this.flag;
    }

    @Override
    public void isMakeNote() {
        System.out.println("提供设计模式课程源代码");
    }
}
