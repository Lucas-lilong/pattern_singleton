package com.lucas.lazy.doubleChecked;

import com.lucas.lazy.LazySingleton;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class DoubleCheckSingleton {
    //  1:定义LazySingleton对象
    private static DoubleCheckSingleton lazySingleton;

    //  2：私有化构造函数
    private DoubleCheckSingleton() {
        if (lazySingleton != null) {//防止反射攻击单例
            throw new RuntimeException("Multiple instances are Not allowed to build!");
        }
    }

    //  3：提供统一入口
    public static DoubleCheckSingleton getLazySingleton() {
        if (lazySingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new DoubleCheckSingleton();
                }
            }

        }
        return lazySingleton;
    }

}
