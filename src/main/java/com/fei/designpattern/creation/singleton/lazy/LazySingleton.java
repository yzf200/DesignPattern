package com.fei.designpattern.creation.singleton.lazy;

public  class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private  LazySingleton() {
    }

    public  static synchronized LazySingleton  getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
