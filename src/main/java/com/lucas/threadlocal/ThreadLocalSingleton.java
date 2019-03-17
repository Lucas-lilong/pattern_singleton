package com.lucas.threadlocal;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL =
            new InheritableThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    public static Object getInstance() {
        return THREAD_LOCAL.get();
    }
}
