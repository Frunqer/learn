package com.lianjia.test_glz.design_pattern.singleton;

/**
 * @Author: guiliangzhou
 * @Description:  单例模式，饿汉模式
 * @Date: Created in 下午6:18 2018/5/29
 * @Modified By:
 */
public class Singleton1 {

    private static final Singleton1 SINGLETON_1 = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return SINGLETON_1;
    }

}
