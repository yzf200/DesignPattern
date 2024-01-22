package com.fei.designpattern.creation.abstractfactory;

public class Test {
    public static void main(String[] args) {
//        CarFactory carFactory = new CarBrandAFactory();
        CarFactory carFactory = new CarBrandBFactory();

        CarDoor carDoor= carFactory.getCarDoor();
        CarFrame carFrame = carFactory.getCarFrame();
        CarBasePlate carBasePlate = carFactory.getCarBasePlate();

        carDoor.open();
        carFrame.hard();
        carBasePlate.stable();
    }
}
