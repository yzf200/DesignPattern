package com.fei.designpattern.creation.singleton.breaks;

import com.fei.designpattern.creation.singleton.enumsingleton.EnumSingleton;
import com.fei.designpattern.creation.singleton.lazy.LazySingleton;

import java.io.*;

public class TestSerializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.EnumSingleton;
        FileOutputStream fos = new FileOutputStream(new File("D:\\桌面", "单例序列化"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
//        oos.writeObject(lazySingleton);
        oos.writeObject(enumSingleton);

        oos.close();
        bos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(new File("D:\\桌面", "单例序列化"));
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
//        LazySingleton lazySingletonSerialize = (LazySingleton) ois.readObject();
        EnumSingleton enumSingletonSerialize = (EnumSingleton) ois.readObject();

        ois.close();
        bis.close();
        fis.close();

//        System.out.println(lazySingletonSerialize);
        System.out.println(enumSingletonSerialize);

//        System.out.println(lazySingleton);
        System.out.println(enumSingleton);

//        System.out.println(lazySingletonSerialize == lazySingleton);

        System.out.println(enumSingletonSerialize == enumSingleton);

    }
}
