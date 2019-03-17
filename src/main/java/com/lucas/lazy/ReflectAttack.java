package com.lucas.lazy;

import java.lang.reflect.Constructor;

/**
 * 2019/3/17
 * 创建人：lilonglong
 * 反射攻击单例
 */
public class ReflectAttack {

    public static void main(String[] args) {
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        try {
            Constructor<LazySingleton> constructor = lazySingletonClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazySingleton singleton = LazySingleton.getLazySingleton();
            LazySingleton lazySingleton = constructor.newInstance();
            System.out.println("lazySingleton object "+lazySingleton);
            System.out.println("reflectSingletion object "+singleton);
            System.out.println(lazySingleton==singleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
