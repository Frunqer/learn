package com.lianjia.test_glz;

/**
 * Created by guiliangzhou on 2017/5/23.
 */
public class CurrentConditionDisplay implements Observer,Display{

    private WeatherData weatherData;

    private float temperature; //温度
    private float humidity;    //湿度
    private float pressure;    //气压


    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature=this.weatherData.getTemperature();
        this.humidity=this.weatherData.getHumidity();
        this.pressure=this.weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("温度："+this.temperature);
        System.out.println("湿度："+this.humidity);
        System.out.println("气压："+this.pressure);
    }
}
