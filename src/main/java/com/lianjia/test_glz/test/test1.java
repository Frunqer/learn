package com.lianjia.test_glz.test;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午6:26 2018/1/24
 * @Modified By:
 */
public class test1 {

    public static void main(String[] args) {
        System.out.println(turn(6));
    }

    public static int turn(int n){
        if(n < 0 ){
            System.out.println("parameter 'n' is not allowed");
            return 0;
        }
        if(n < 3){
            return n;
        }
        return turn(n-1)+turn(n-2);
    }
}
