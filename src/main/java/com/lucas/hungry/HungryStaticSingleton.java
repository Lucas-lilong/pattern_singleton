package com.lucas.hungry;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class HungryStaticSingleton {
//  1：私有化构造函数
    private HungryStaticSingleton() {
    }
//  2:定义HungryStaticSingleton对象
    private static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON ;
//  3：给对象赋值
    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }
//  4：提供统一入口
    public static final Object getInstance() {
        return HUNGRY_STATIC_SINGLETON;
    }
}
