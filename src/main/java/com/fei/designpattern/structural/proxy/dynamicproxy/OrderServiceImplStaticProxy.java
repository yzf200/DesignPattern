package com.fei.designpattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceImplStaticProxy implements InvocationHandler {
    private Object service;

    public OrderServiceImplStaticProxy(Object service) {
        this.service = service;
    }

    public void before() {
        System.out.println("代理对象...开启事务...");
    }

    public void after() {
        System.out.println("代理对象...提交事务...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(service, args);
        after();
        return invoke;
    }

    public Object bind() {
        return Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(),this::invoke);
    }
}
