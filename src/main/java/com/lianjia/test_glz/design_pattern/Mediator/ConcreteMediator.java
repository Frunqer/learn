package com.lianjia.test_glz.design_pattern.Mediator;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:12 2018/11/29
 * @Modified By:
 */
public class ConcreteMediator extends Mediator {

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calendar calendar;
    private  Sprinkler sprinkler;

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calendar calendar, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calendar = calendar;
        this.sprinkler = sprinkler;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                alarm.doAlarm();
                break;
            case "coffeePot":
                coffeePot.doCoffeePot();
                break;
            case "calendar":
                calendar.doCalender();
                break;
            default:
                sprinkler.doSprinkler();
        }

    }

}
