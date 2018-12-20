package com.lianjia.test_glz.design_pattern.Mediator;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:10 2018/11/29
 * @Modified By:
 */
public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
