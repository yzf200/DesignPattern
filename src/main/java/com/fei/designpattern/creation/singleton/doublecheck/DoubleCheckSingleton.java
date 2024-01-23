package com.fei.designpattern.creation.singleton.doublecheck;

public class DoubleCheckSingleton {
    private static volatile  DoubleCheckSingleton doubleCheckSingleton ;
    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton ==null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }

        return doubleCheckSingleton;
    }
}
