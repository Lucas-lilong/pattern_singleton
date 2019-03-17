package com.lucas.lazy;

import java.io.*;

/**
 * 2019/3/17
 * 创建人：lilonglong
 * 序列化和反序列化攻击单例
 */
public class SerializeAttack {
    public static void main(String[] args) {
        LazySingleton lazySingleton=null;
        LazySingleton singleton = LazySingleton.getLazySingleton();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("LazyObject.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("LazyObject.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            lazySingleton =(LazySingleton) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("LazySingleton object "+singleton);
            System.out.println("SerializeSingeton Object "+lazySingleton);
            System.out.println(lazySingleton==singleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
