package com.fei.designpattern.creation.abstractfactory;

public class CarBrandAFactory extends CarFactory{
    @Override
    public CarDoor getCarDoor() {
        return new CarDoorBrandA();
    }

    @Override
    public CarFrame getCarFrame() {
        return new CarFrameBrandA();
    }

    @Override
    public CarBasePlate getCarBasePlate() {
        return new CarBasePlateBrandA();
    }
}
