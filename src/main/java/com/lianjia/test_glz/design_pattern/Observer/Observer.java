package com.lianjia.test_glz.design_pattern.Observer;

/**
 * @Author: guiliangzhou
 * @Description: 观察者
 * @Date: Created in 下午2:20 2018/11/29
 * @Modified By:
 */
public interface Observer {

    /**
     * 更新天气
     * @param temp
     * @param humidity
     * @param pressure
     */
    void updateWaather(float temp,float humidity,float pressure);
}
