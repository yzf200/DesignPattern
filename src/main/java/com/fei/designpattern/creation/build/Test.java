package com.fei.designpattern.creation.build;

public class Test {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
//        Builder builder = new BMWBuilder();
        Builder builder = new TeslaBuilder();

        engineer.make(builder);
    }
}
