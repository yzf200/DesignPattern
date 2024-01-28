package com.fei.designpattern.behavioral.templatemethod;

public class H5Class extends AClass{

    @Override
    protected boolean flag() {
        return false;
    }

    @Override
    public void isMakeNote() {
        System.out.println("提供前端课程的素材及代码");
    }
}
