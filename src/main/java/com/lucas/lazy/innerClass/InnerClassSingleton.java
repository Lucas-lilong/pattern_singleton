package com.lucas.lazy.innerClass;

import com.lucas.lazy.doubleChecked.DoubleCheckSingleton;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class InnerClassSingleton {

    //  1:私有化构造函数
    private InnerClassSingleton() {
        if (InnerSingleton.INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("Multiple instances are Not allowed to build!");
        }
    }

    //  2：提供统一入口
    public static InnerClassSingleton getLazySingleton() {
        return InnerSingleton.INNER_CLASS_SINGLETON;
    }
//  3:静态内部类
    static class InnerSingleton{
        private static final InnerClassSingleton INNER_CLASS_SINGLETON=new InnerClassSingleton();
    }


}
