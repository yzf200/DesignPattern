package com.fei.designpattern.structural.faced;

public class TackingSystem {

    private SelectFoodService selectFoodService;
    private PayService payService;
    private OrderService orderService;

    public TackingSystem() {
        selectFoodService = new SelectFoodService();
        payService = new PayService();
        orderService = new OrderService();
    }

    public void orderTacking(Food food){

        //点餐
        selectFoodService.select(food.getName());

        //校验余额
        boolean flag = payService.checkBanlance();

        if(flag){
            payService.pay();

            orderService.makeOrder();
        }
    }

}
