package com.fei.designpattern.creation.build;

public class BMWBuilder extends Builder{
    @Override
    public Door buildDoor() {
        return new Door("宝马自己的车门生产");
    }

    @Override
    public Frame buildFrame() {
        return new Frame("宝马自己的车架生产");
    }

    @Override
    public BasePlate buildBasePlate() {
        return new BasePlate("宝马自己的底盘生产");
    }
}
