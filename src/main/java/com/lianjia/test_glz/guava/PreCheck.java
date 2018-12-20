package com.lianjia.test_glz.guava;

import com.google.common.base.Preconditions;

/**
 * Created by guiliangzhou on 2017/6/6.
 */
public class PreCheck {
    public static void main(String[] args) {
        new PreCheck().test03();
    }

    public void test01(){
        boolean flag=true;

        int i=4,j=5;
        Preconditions.checkArgument(flag==false,"不符合条件");
    }

    public void test02(){
        int i=4,j=5;
        Preconditions.checkArgument(i>j,"Expected i >j, but %s < %s",i,j);
    }

    public void test03(){
        int i=4,j=5;
        Integer n=null;
        System.out.println(Preconditions.checkNotNull(n,"无法打印空对象"));
    }
}
