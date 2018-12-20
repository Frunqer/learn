package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description: 不用加号算加法
 * @Date: Created in 上午11:17 2018/1/25
 * @Modified By:
 */
public class Solution6 {

    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    public static int  sum(int n){
        int t =n;
        boolean flag = (t > 1)  &&  ((t = add(sum(n-1),t)) > 0);
        return t;
    }

    public static int  add(int m ,int n){
            //1、a，b进行异或运算，计算出不变的位
            //2、计算出进位(求与)
            //3、相加即可
           /* if (n == 0)
                return m;
            int temp1 = m^n;
            int temp2 = (m&n) << 1;//可能产生进位

            return add(temp1, temp2);*/
           int t = m;
           int temp1 = m^n;
           int temp2 = (m&n) << 1;
           boolean flag = (n != 0) && (t = add(temp1,temp2)) > 0;
           return t;
        }
    }

