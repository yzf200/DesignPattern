package com.fei.designpattern.creation.simplefactory;

public class Test {

    public static void main(String[] args) {
//        String name = "java";
        String name = "python";
        Course course = CourseFactory.getCourse(name);
        course.make();
    }
}
