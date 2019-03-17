package com.lucas.hungry;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class MainHungryTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = (HungrySingleton) HungrySingleton.getInstance();
        System.out.println("hungry object "+hungrySingleton);
        HungryStaticSingleton hungryStaticSingleton= (HungryStaticSingleton) HungryStaticSingleton.getInstance();
        System.out.println("hungry static object "+hungryStaticSingleton);
    }
}
