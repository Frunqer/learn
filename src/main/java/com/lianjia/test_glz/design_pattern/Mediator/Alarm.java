package com.lianjia.test_glz.design_pattern.Mediator;


/**
 * @Author: guiliangzhou
 * @Description: 闹钟
 * @Date: Created in 下午12:01 2018/11/29
 * @Modified By:
 */
public class Alarm extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm () {
        System.out.println("doAlram()");
    }
}
