package com.fei.designpattern.creation.factorymethod;

public class Test {

    public static void main(String[] args) {
//        CourseFactory factory = new JavaCourseFactory();
        CourseFactory factory = new PythonCourseFactory();

        Course course = factory.getCourse();
        course.make();
    }
}
