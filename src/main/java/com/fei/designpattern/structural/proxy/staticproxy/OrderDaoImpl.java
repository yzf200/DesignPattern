package com.fei.designpattern.structural.proxy.staticproxy;

public class OrderDaoImpl implements OrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("持久层...保存订单信息..."+order);
        return 1;
    }
}
