package com.fei.designpattern.creation.factorymethod;

public class PythonCourseFactory extends CourseFactory {
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
