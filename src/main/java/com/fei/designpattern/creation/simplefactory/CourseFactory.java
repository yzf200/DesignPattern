package com.fei.designpattern.creation.simplefactory;

public class CourseFactory {

    //由工厂来进行产品的制作，不对外展示细节
    public static Course getCourse(String courseType) {
        if ("java".equalsIgnoreCase(courseType)) {
            return new JavaCourse();
        } else if ("python".equalsIgnoreCase(courseType)) {
            return new PythonCourse();
        } else {
            throw new RuntimeException("没有这种类型的课程");
        }
    }
}
