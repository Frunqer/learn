package com.lianjia.test_glz.design_pattern.Iterator;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 上午11:17 2018/11/29
 * @Modified By:
 */
public class ConcreteIterator<T> implements Iterator {

    private T[] items;
    private int position = 0;

    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
