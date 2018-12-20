package com.lianjia.test_glz.design_pattern.Observer;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午2:47 2018/11/29
 * @Modified By:
 */
public class ForecastDisplay implements Observer,Display {

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.regisiterObserver(this);
    }

    /**
     * 显示天气
     */
    @Override
    public void display() {
    }

    /**
     * 更新天气
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void updateWaather(float temp, float humidity, float pressure) {
        String str = String.format("ForecastDisplay:{temp:%s,humidity:%s,pressure:%s}",temp,humidity,pressure);
        System.out.println(str);
    }
}
