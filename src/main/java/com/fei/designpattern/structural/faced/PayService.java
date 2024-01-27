package com.fei.designpattern.structural.faced;

public class PayService {

    public void pay(){
        System.out.println("正在支付...");
    }

    public boolean checkBanlance(){
        System.out.println("检查用户的余额...");
        return true;
    }

}
