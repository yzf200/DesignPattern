package com.fei.designpattern.creation.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student zs = new Student();
        zs.setName("张三");
        zs.setFavorite("打篮球");
        System.out.println(zs);

        Student ls = (Student) zs.clone();
        ls.setName("李四");
        ls.setFavorite("rap");
        System.out.println(ls);
    }
}
