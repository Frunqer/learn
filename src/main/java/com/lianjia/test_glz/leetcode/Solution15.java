package com.lianjia.test_glz.leetcode;

/**
 * 1-1000放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现 一次。
 * 每个数组元素只能访问一次，设计一个算法，将它找出来；不用辅助存储空间.
 *
 * @Author: guiliangzhou
 * @Date: Created in 下午5:41 2018/8/3
 */
public class Solution15 {

    //方案一
    static int function1(int[] a) {
        if (null == a || a.length != 1001) {
            throw new RuntimeException("paramter is not allowed");
        }
        int sum1 = a[0];
        for (int i = 1; i <= a.length; i++) {
            sum1 += a[i];
        }
        for (int i = 0; i < a.length - 1; i++) {
            sum1 -= i;
        }
        return sum1;
    }

    //方案二
    static int function2(int[] a) {
        if (null == a || a.length != 1001) {
            throw new RuntimeException("paramter is not allowed");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[a[i]]) {
                return a[i];
            } else {
                //diff - swap
                if (a[i] != i) {
                    a[i] = a[a[i]] - a[i];
                    a[a[i]] = a[a[i]] - a[i];
                    a[i] = a[i] + a[a[i]];
                }
            }
        }
        return 0;
    }

    //方案三
    static int function3(int[] a) {
        if (null == a || a.length != 1001) {
            throw new RuntimeException("paramter is not allowed");
        }
        for (int i = 1; i <= a.length; i++) {
            a[0] = a[0] ^ a[i];
        }
        for (int i = 1; i <= 1000; i++) {
            a[0] = a[0] ^ i;
        }
        return a[0];
    }

}
