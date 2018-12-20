package com.lianjia.test_glz.design_pattern.Iterator;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 上午11:21 2018/11/29
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
