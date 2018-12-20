package com.lianjia.test_glz.design_pattern.singleton;

/**
 * @Author: guiliangzhou
 * @Description: 静态内部类实现
 * @Date: Created in 下午5:09 2018/11/26
 * @Modified By:
 */
public class Singleton3 {

    private Singleton3 () {

    }

    private static class Singleton3Builder {
        private static final Singleton3 INSATANCE = new Singleton3();
    }

    public static Singleton3 getInstance () {
        return Singleton3Builder.INSATANCE;
    }
}
