package com.fei.designpattern.behavioral.memento;

//发起者
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Order saveStateToOrder(){
        return new Order(state);
    }

    public  void getStateFromOrder(Order order){
        state = order.getState();
    }
}
