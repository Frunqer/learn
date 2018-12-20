package com.lianjia.test_glz.leetcode;

import java.math.BigInteger;

/**
 * @Author: guiliangzhou
 * @Description:
 */
public class Solution13 {

    static String add(String s1, String s2) {
        if (null == s1 || null == s2 || "" == s1 || "" == s2) {
            throw new RuntimeException("paramter is not allowed");
        }
        BigInteger b1 = new BigInteger(s1, 36);
        BigInteger b2 = new BigInteger(s2, 36);
        return b1.add(b2).toString(36);
    }

    public static void main(String[] args) {
        String s1 = "2347ABGH";
        String s2 = "8763HJED35649";
        System.out.println(add(s1,s2));
    }
}
