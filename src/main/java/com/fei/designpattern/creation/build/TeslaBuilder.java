package com.fei.designpattern.creation.build;

public class TeslaBuilder extends Builder{
    @Override
    public Door buildDoor() {
        return new Door("特斯拉自己的车门生产");
    }

    @Override
    public Frame buildFrame() {
        return new Frame("特斯拉自己的车架生产");
    }

    @Override
    public BasePlate buildBasePlate() {
        return new BasePlate("特斯拉自己的底盘生产");
    }
}
