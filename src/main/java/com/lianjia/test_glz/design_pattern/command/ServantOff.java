package com.lianjia.test_glz.design_pattern.command;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:10 2018/11/28
 * @Modified By:
 */
public class ServantOff implements Command{

    private Light light;

    public ServantOff(Light light) {
        this.light = light;
    }

    public void excute() {
        light.off();
    }
}
