package com.lianjia.test_glz.design_pattern.template_method;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午6:29 2018/11/29
 * @Modified By:
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        brew();
        addCondiments();
        boilWater();
        pourInCup();

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }

}
