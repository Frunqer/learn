package com.lianjia.test_glz.leetcode;

import java.util.Random;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午10:47 2018/8/2
 * @Modified By:
 */
public class Solution14 {

    static Random random = new Random(10);

    //已知函数
    static int function() {
        return random.nextInt(2);
    }


    /**
     * 思路：每次调用结果为0的概率：p 为1的概率: 1-p
     * 所以同时调用两次，第一次调用结果为0，第二次结果为1的概率 m = p*(1-p)
     * 同理，第一次调用结果为1，第二次结果为0的概率 n = (1-p)*p
     * m = n = p*(1-p)
     * 因此我们只考虑这两种情况，则他们出现的几率一定是相等的。
     *
     * @return
     */
    static int myFunction() {
        while (true) {
            int a = function();
            int b = function();
            if (a == 0 && b == 1) {
                return 1;
            }
            if (a == 1 && b == 0) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(myFunction());
        }
    }
}
