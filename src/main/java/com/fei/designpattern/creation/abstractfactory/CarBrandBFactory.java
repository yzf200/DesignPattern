package com.fei.designpattern.creation.abstractfactory;

public class CarBrandBFactory extends CarFactory{
    @Override
    public CarDoor getCarDoor() {
        return new CarDoorBrandB();
    }

    @Override
    public CarFrame getCarFrame() {
        return new CarFrameBrandB();
    }

    @Override
    public CarBasePlate getCarBasePlate() {
        return new CarBasePlateBrandB();
    }
}
