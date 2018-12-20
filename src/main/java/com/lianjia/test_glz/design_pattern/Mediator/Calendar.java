package com.lianjia.test_glz.design_pattern.Mediator;

import javax.sound.midi.VoiceStatus;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:08 2018/11/29
 * @Modified By:
 */
public class Calendar extends Colleague{

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calendar");
    }

    public void doCalender() {
        System.out.println("doCalendar()");
    }
}
