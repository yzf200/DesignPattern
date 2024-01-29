package com.fei.designpattern.behavioral.state;

public class EndState implements State{

    @Override
    public void oprator(Context context) {
        System.out.println("当前操作,已结束...");
        context.setState(this);
    }

    public String toString(){
        return "正在停止中...";
    }
}
