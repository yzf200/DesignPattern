package com.fei.designpattern.structural.faced;

public class Test {

    public static void main(String[] args) {

        Food food = new Food();
        food.setName("鱼香肉丝");

        TackingSystem system = new TackingSystem();
        system.orderTacking(food);

    }
}
