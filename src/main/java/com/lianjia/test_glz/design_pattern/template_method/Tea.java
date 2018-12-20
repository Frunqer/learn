package com.lianjia.test_glz.design_pattern.template_method;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午6:37 2018/11/29
 * @Modified By:
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
