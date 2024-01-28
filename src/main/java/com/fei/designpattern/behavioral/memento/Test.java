package com.fei.designpattern.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        Memento memento = new Memento();
        Container container = new Container();

        memento.setState("1# 打开冰箱");
        container.add(memento.saveStateToOrder());
        memento.setState("2# 将大象放进去");
        container.add(memento.saveStateToOrder());
        memento.setState("3# 将冰箱门关上");
        container.add(memento.saveStateToOrder());

        System.out.println("当前步骤:"+memento.getState());

        memento.getStateFromOrder(container.get(0));
        System.out.println("备忘录:"+memento.getState());
        memento.getStateFromOrder(container.get(1));
        System.out.println("备忘录:"+memento.getState());
        memento.getStateFromOrder(container.get(2));
        System.out.println("备忘录:"+memento.getState());
    }
}
