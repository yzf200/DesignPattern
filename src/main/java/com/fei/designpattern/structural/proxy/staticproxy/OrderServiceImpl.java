package com.fei.designpattern.structural.proxy.staticproxy;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;
    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("业务层...调用持久层...");
        return orderDao.insert(order);
    }
}
