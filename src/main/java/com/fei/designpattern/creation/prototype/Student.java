package com.fei.designpattern.creation.prototype;

public class Student implements Cloneable{
    private String name;
    private String favorite;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", favorite='" + favorite + '\'' +
                '}'+super.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student() {
        System.out.println("学生初始化了");
    }

    public String getName() {
        return name;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
