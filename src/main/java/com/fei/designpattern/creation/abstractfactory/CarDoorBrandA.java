package com.fei.designpattern.creation.abstractfactory;

public class CarDoorBrandA extends CarDoor{
    @Override
    public void open() {
        System.out.println("A牌的车门可以正常开关");
    }
}
