package com.fei.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Order> orderList = new ArrayList<>();

    public void add(Order order){
        orderList.add(order);
    }

    public Order get(int index){
        return orderList.get(index);
    }
}
