package com.lianjia.test_glz.design_pattern.command;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:19 2018/11/28
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Light light = new Light();
        Command off = new ServantOff(light);
        Command on = new ServantOn(light);
        invoker.setOffCommands(off,0);
        invoker.setOnCommands(on,0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
