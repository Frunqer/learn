package com.lianjia.test_glz.mianshi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Created by guiliangzhou on 2017/7/17.
 */
public class RandomFive {
    public static void main(String[] args) {
        System.out.println(new RandomFive().getCode());
    }
    public String getCode() {
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();
        while (set.size() < 6) {
            set.add(random.nextInt(10));
        }
        Iterator<Integer>iterator=set.iterator();
        StringBuilder sb=new StringBuilder();
        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        String code=sb.toString();
        //如果首位为0，则将0放到最后
        if(code.substring(0,1).equals("0")){
            code=code.substring(1,5)+"0";
        }
        return code;
    }

}
