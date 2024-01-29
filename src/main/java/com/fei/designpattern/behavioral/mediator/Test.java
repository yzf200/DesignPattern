package com.fei.designpattern.behavioral.mediator;

public class Test {

    public static void main(String[] args) {
        User zhangsan = new User("张三");
        User lisi = new User("李四");

        zhangsan.sendMessage("李四帮我定一个外卖...");
        lisi.sendMessage("收到~好的,一会儿就订好...");

    }
}
