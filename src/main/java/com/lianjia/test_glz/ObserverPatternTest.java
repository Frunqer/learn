package com.lianjia.test_glz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guiliangzhou on 2017/5/23.
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

        List<Float> list=new ArrayList<Float>();
        list.add(22f);
        list.add(-3f);
        list.add(32f);
        list.add(27f);

        weatherData.setMeasurements(21f,0.8f,1.3f,list);
    }
}
