package com.lianjia.test_glz.design_pattern.Observer;

/**
 * @Author: guiliangzhou
 * @Description: 主题
 * @Date: Created in 下午2:23 2018/11/29
 * @Modified By:
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void regisiterObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
