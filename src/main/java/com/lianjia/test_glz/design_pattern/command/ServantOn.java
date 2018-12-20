package com.lianjia.test_glz.design_pattern.command;

/**
 * @Author: guiliangzhou
 * @Description: 仆人
 * @Date: Created in 下午12:07 2018/11/28
 * @Modified By:
 */
public class ServantOn implements Command{

    private Light light;

    public ServantOn(Light light) {
        this.light = light;
    }

    public void excute() {
        light.on();
    }
}
