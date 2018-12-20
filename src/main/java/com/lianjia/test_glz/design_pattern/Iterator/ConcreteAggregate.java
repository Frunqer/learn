package com.lianjia.test_glz.design_pattern.Iterator;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 上午11:14 2018/11/29
 * @Modified By:
 */
public class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate(){
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(items);
    }
}
