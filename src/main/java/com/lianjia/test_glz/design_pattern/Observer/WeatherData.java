package com.lianjia.test_glz.design_pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午2:27 2018/11/29
 * @Modified By:
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature,float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    /**
     * 注册观察者
     *
     * @param observer
     */
    @Override
    public void regisiterObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.updateWaather(temperature,humidity,pressure);
        }
    }
}
