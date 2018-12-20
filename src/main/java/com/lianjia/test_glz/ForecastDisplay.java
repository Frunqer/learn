package com.lianjia.test_glz;

import java.util.List;

/**
 * Created by guiliangzhou on 2017/5/23.
 */
public class ForecastDisplay implements Observer,Display{
    private WeatherData weatherData;

    private List<Float> forecastTemperatures;  //未来几天的温度
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    public void update() {
     this.forecastTemperatures=weatherData.getForecastTemperatures();
     display();
    }

    public void display() {
        for(int i=0,n=this.forecastTemperatures.size();i<n;i++){
            System.out.println("第"+i+"天:"+this.forecastTemperatures.get(i));
        }
    }
}
