package com.fei.designpattern.structural.proxy.staticproxy;

public class OrderServiceImplStaticProxy {
    private OrderService orderService;

    public OrderServiceImplStaticProxy() {
    }

    public OrderServiceImplStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    public int saveOrder(Order order) {
        //执行代理的业务逻辑...
        //开启事务
        before();

        System.out.println("代理对象...调用业务层等...");
        int i = orderService.saveOrder(order);

        //提交事务
        after();

        return i;
    }

    public void before() {
        System.out.println("代理对象...开启事务...");
    }

    public void after() {
        System.out.println("代理对象...提交事务...");
    }
}
