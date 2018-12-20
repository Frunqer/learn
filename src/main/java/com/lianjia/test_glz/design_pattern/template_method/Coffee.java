package com.lianjia.test_glz.design_pattern.template_method;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午6:36 2018/11/29
 * @Modified By:
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee.addCondiments");
    }
}
