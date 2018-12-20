package com.lianjia.test_glz.java8;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by guiliangzhou on 2017/6/6.
 */
public class Test01 {
    public static void main(String[] args) {

    }

    public void test01(){
        new Thread(() -> System.out.println("hello world")).start();
    }

    public void test03(){
        Runnable noArguments=() -> System.out.println("java 8");
        Runnable multiStatement = () ->{
            System.out.println("hello world");
            System.out.println("world hello");
        };
    }

    public void test04(){
        Predicate<Integer> atLeast5=x -> x > 5;
    }


    static BinaryOperator<Long> addLongs = (x,y) -> x+y;


}
