package com.lianjia.test_glz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guiliangzhou on 2017/5/22.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature; //温度
    private float humidity;   //湿度
    private float pressure;   //气压

    private List<Float> forecastTemperatures;

    public WeatherData(){
        this.observers=new ArrayList<Observer>();
    }


    /**
     * 注册观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知观察者
     *
     */
    public void notifyObserver() {
        for(Observer observer1:observers){
            observer1.update();
        }
    }

    public void changeMeasurements(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float pressure,List<Float> forecastTemperatures){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        this.forecastTemperatures=forecastTemperatures;
        changeMeasurements();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }
}
