package com.lianjia.test_glz.design_pattern.simple_factory;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:19 2018/11/26
 * @Modified By:
 */
public class SimpleFactory {

    public Product create (Integer type) {
        switch (type) {
            case 1:return new Product1();
            case 2:return new Product2();
            default: return null;
        }
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.create(1);
        product.say();
    }
}
