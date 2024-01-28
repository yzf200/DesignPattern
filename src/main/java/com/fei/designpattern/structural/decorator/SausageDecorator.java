package com.fei.designpattern.structural.decorator;

public class SausageDecorator extends ADecorator {

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void someThing() {

    }

    @Override
    protected String getInfo() {
        return super.getInfo() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 3;
    }
}
