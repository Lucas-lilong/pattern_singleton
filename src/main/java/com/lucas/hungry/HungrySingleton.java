package com.lucas.hungry;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();
//  1：私有化构造函数
    private HungrySingleton() {

    }

    //  2：提供公共入口
    public static final Object getInstance() {
        return HUNGRY_SINGLETON;
    }

    public Object readResolve() {
        return  HUNGRY_SINGLETON;
    }
}
