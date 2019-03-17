package com.lucas.lazy.innerClass;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class MainInnerSingleton {
    public static void main(String[] args) {
        InnerClassSingleton innerClassSingleton = InnerClassSingleton.getLazySingleton();
        System.out.println(innerClassSingleton);
    }
}
