package com.fei.designpattern.behavioral.command;

public class Test {
    public static void main(String[] args) {
        Stock aaaStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(aaaStock);
        SellStock sellStockOrder = new SellStock(aaaStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
