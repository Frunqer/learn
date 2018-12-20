package com.lianjia.test_glz.design_pattern.Mediator;

/**
 * @Author: guiliangzhou
 * @Description: 咖啡壶
 * @Date: Created in 下午12:04 2018/11/29
 * @Modified By:
 */
public class CoffeePot extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
