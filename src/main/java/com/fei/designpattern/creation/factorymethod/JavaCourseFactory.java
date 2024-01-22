package com.fei.designpattern.creation.factorymethod;

public class JavaCourseFactory extends CourseFactory{
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
