package com.fei.designpattern.behavioral.state;

public class StartState implements State {
    @Override
    public void oprator(Context context) {
        System.out.println("当前操作,已开始...");
        context.setState(this);
    }

    public String toString(){
        return "正在进行中...";
    }

}
