package com.lianjia.test_glz.guava;


import com.google.common.base.Optional;

/**
 * Created by guiliangzhou on 2017/6/2.
 */
public class GuavaTest01 {

    public static void main(String[] args) {
        Optional<Integer> possible=Optional.of(5);
        Student student=null;

        System.out.println(possible.isPresent());
        System.out.println(possible.get());
        System.out.println(Optional.fromNullable(student).or(student));
    }
    public class Student{

    }
}
