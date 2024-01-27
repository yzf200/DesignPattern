package com.fei.designpattern.structural.bridge;

public class Test {

    public static void main(String[] args) {

        //使用工具去绘制图形
        Tools tools1 = new Pencil(new Circle());
        //绘制圆形
        tools1.use();

        Tools tools2 = new Pen(new Square());
        //绘制方形
        tools2.use();

    }
}
