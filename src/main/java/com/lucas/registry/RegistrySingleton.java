package com.lucas.registry;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 2019/3/17
 * 创建人：lilonglong
 */
public class RegistrySingleton {
    private static  ConcurrentHashMap<String,Object> IOC = new ConcurrentHashMap<String,Object>();

    private RegistrySingleton() {
    }

    public static Object getBean(String className) {
        Object obj = null;
        synchronized (IOC) {
            if (IOC.containsKey(className)) {
                try {
                    obj = Class.forName(className).newInstance();
                    IOC.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return IOC.get(className);
        }
    }

}
