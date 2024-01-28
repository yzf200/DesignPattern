package com.fei.designpattern.structural.decorator;

public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getInfo() + " 价格:::>>>" + aBatterCake.cost());
    }
}
