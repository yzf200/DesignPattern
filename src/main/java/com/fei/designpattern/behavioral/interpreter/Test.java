package com.fei.designpattern.behavioral.interpreter;

public class Test {

    public static void main(String[] args) {

        Expression zhangsan = new TerminalExpression("zhangsan");
        Expression lisi = new TerminalExpression("lisi");
        OrExpression orExpression = new OrExpression(zhangsan, lisi);

        System.out.println("张三是一个男人嘛? "+orExpression.interpret("zhangsan"));

        Expression wangwu = new TerminalExpression("wangwu");
        Expression zhaoliu = new TerminalExpression("married");
        AndExpression andExpression = new AndExpression(wangwu, zhaoliu);

        System.out.println("王五是否已婚? "+andExpression.interpret("wangwu married"));


    }
}
