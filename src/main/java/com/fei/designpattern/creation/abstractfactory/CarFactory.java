package com.fei.designpattern.creation.abstractfactory;

/**
 * 一个抽象工厂，定义了一系列的抽象产品的获取方法
 */
public abstract class CarFactory {
    public abstract CarDoor getCarDoor();

    public abstract CarFrame getCarFrame();

    public abstract CarBasePlate getCarBasePlate();
}
