package com.lianjia.test_glz.design_pattern.singleton;

/**
 * @Author: guiliangzhou
 * @Description: 同步机制
 * @Date: Created in 下午6:24 2018/5/29
 * @Modified By:
 */
public class Singleton2 {

    private static Singleton2 singleton2 = null;

    private Singleton2(){

    }

    public static Singleton2 getInstance () {
        if (null == singleton2) {
            synchronized (Singleton2.class) {
                if (null == singleton2) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
