package com.fei.designpattern.behavioral.command;

public class Stock {

    private String name = "AAA";
    private int count = 10;

    public void buy(){
        System.out.println("购买 [股票 : "+name+"] , 数量 : "+count+" 个");
    }

    public void sell(){
        System.out.println("卖出 [股票 : "+name+"] , 数量 : "+count+" 个");
    }
}
