package com.lianjia.test_glz.design_pattern.template_method;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午6:39 2018/11/29
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {

        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
