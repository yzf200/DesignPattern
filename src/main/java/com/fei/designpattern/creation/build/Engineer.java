package com.fei.designpattern.creation.build;

public class Engineer {
    private Car car = new Car();

    public void make(Builder builder) {
        car.setDoor(builder.buildDoor());
        car.setFrame(builder.buildFrame());
        car.setBasePlate(builder.buildBasePlate());
        System.out.println("工程师已经完成了车的组装逻辑：" + car);
    }
}
