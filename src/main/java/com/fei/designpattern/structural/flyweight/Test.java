package com.fei.designpattern.structural.flyweight;

public class Test {

    private static final String[] departments = {"市场部","营销部","广告部","业务服务部"};

    public static void main(String[] args) {

        for (String department : departments) {
            Employee manager = ManagementFactory.getManager(department);
            manager.report();
        }

    }
}
