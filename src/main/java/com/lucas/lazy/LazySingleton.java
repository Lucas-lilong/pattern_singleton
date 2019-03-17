package com.lucas.lazy;

import java.io.Serializable;

/**
 * 2019/3/17
 * 创建人：lilonglong
 * 这样写有个很大的缺点：线程不安全
 */
public class LazySingleton implements Serializable {
//  1:定义LazySingleton对象
    private static LazySingleton lazySingleton;
//  2：私有化构造函数
    private LazySingleton() {
        if (lazySingleton != null) {//防止反射攻击单例
            throw new RuntimeException("Multiple instances are Not allowed to build!");
        }
    }
//  3：提供统一入口
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
        lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
