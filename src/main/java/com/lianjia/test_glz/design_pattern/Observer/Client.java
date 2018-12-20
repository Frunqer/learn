package com.lianjia.test_glz.design_pattern.Observer;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午3:09 2018/11/29
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(0,0,0);
        weatherData.setMeasurements(1,1,1);

    }
}
