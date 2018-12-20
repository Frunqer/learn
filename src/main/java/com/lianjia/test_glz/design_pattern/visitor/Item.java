package com.lianjia.test_glz.design_pattern.visitor;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午3:26 2018/11/30
 * @Modified By:
 */
public class Item implements Element {

    private String name;

    public Item(String name) {
        this.name = name;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit();
    }
}
