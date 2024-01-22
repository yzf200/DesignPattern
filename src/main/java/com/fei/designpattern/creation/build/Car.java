package com.fei.designpattern.creation.build;

public class Car {
    private Door door;
    private Frame frame;
    private BasePlate basePlate;

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setBasePlate(BasePlate basePlate) {
        this.basePlate = basePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "door='" + door + '\'' +
                ", frame='" + frame + '\'' +
                ", basePlate='" + basePlate + '\'' +
                '}';
    }
}
