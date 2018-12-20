package com.lianjia.test_glz.design_pattern.factory;

import com.lianjia.test_glz.design_pattern.simple_factory.Product;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:40 2018/11/26
 * @Modified By:
 */
public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething(){
        Product product = factoryMethod();
        product.say();
    }
}
