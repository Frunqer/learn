package com.lianjia.test_glz;

/**
 * Created by guiliangzhou on 2017/5/22.
 */

/**
 * 发布者 被订阅被观察者
 */
public interface Subject {


    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
