package com.fei.designpattern.structural.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setInfo("订单信息,购买Iphone100X");
        order.setUserId("1");

        OrderService orderService = new OrderServiceImpl();
        OrderServiceImplStaticProxy proxy = new OrderServiceImplStaticProxy(orderService);
        proxy.saveOrder(order);
    }
}
