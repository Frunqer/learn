package com.lianjia.test_glz.design_pattern.Mediator;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:19 2018/11/29
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {

        Alarm alarm = new Alarm();
        Calendar calendar = new Calendar();
        CoffeePot coffeePot = new CoffeePot();
        Sprinkler sprinkler = new Sprinkler();

        Mediator mediator = new ConcreteMediator(alarm,coffeePot,calendar,sprinkler);
        alarm.onEvent(mediator);
        calendar.onEvent(mediator);
    }
}
