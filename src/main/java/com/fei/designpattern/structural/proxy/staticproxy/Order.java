package com.fei.designpattern.structural.proxy.staticproxy;

public class Order {

    private String info;
    private String userId;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "info='" + info + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
