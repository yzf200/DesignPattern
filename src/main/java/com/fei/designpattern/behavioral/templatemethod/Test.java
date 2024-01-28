package com.fei.designpattern.behavioral.templatemethod;

public class Test {

    public static void main(String[] args) {
        System.out.println("--------------");
        AClass c = new DesignPatternClass(true);
        c.makeClass();
        System.out.println("--------------");
        AClass h = new H5Class();
        h.makeClass();
        System.out.println("--------------");
    }

}
