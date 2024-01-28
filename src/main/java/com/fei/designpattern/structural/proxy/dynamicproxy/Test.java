package com.fei.designpattern.structural.proxy.dynamicproxy;

public class Test {
    public static void main(String[] args) {

        OrderService proxy = (OrderService) new OrderServiceImplStaticProxy(new OrderServiceImpl()).bind();

        Order order = new Order();
        order.setInfo("购买华为 Meta1000");
        order.setUserId("2");

        proxy.saveOrder(order);

    }
}
