package com.fei.designpattern.creation.abstractfactory;

public class CarDoorBrandB extends CarDoor{
    @Override
    public void open() {
        System.out.println("B牌的车门可以正常开关");
    }
}
