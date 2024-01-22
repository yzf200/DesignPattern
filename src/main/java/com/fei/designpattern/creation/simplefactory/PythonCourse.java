package com.fei.designpattern.creation.simplefactory;

public class PythonCourse extends Course{
    @Override
    public void make() {
        System.out.println("制作Python课程");
    }
}
