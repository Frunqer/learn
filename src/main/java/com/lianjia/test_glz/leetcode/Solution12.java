package com.lianjia.test_glz.leetcode;


/**
 * @author: guiliangzhou
 * @description 两个不定长36进制字符串相加,0-9,A-Z
 * @Date: Created in 下午11:12 2018/8/1
 */
public class Solution12 {

     static int isValid(char x) {
        boolean valid = false;
        int i = 0;
        if ('0' <= x && '9' >= x) {
            valid = true;
            i = x - '0';
        }
        if ('A' <= x && 'Z' >= x) {
            valid = true;
            i = x - 'A' + 10;
        }
        if (false == valid) {
            throw new RuntimeException("parameter is not allowed");
        }
        return i;
    }

    static int[] add(int x,int y,int z){
         int sum = x + y + z;
         int round = sum / 36;
         int mod = sum % 36;
         int[] result = {round,mod};
         return result;
    }

    static char toChar(int x){
        char c = '0';
        if (0 < x && 9 > x) {
            c = (char) (x + '0');
        }
        if (10 < x && 36 > x) {
            c = (char) (x - 10 + 'A');
        };
        return c;
    }

    static String add(String s1,String s2){
        if (null == s1 || null == s2 || "" == s1 || "" == s2) {
            throw new RuntimeException("paramter is not allowed");
        }
        //对齐,高位补'0'
        int i = s1.length() - s2.length(),j = 0;
        if (i < 0) {
            j= 0 - i;
        }
        StringBuilder sb = new StringBuilder();
        for (int m = 0;m < j;m++) {
            sb.append("0");
        }
        if (i < 0) {
            s1 = sb.toString() + s1;
        } else {
            s2 = s2 + sb.toString();
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = new char[c1.length + 1];
        int[] sum = {0,0};
        for (int k = c1.length;k > 0;k--) {
            char x = c1[k-1];
            char y = c2[k-1];
            sum = add(isValid(x),isValid(y),sum[0]);
            c3[k] = toChar(sum[1]);
        }
        c3[0] = toChar(sum[0]);
        String result = String.valueOf(c3);
        if(result.startsWith("0")){
            result = result.substring(1,result.length());
        }
        return result;
    }


    //test
    public static void main(String[] args) {
        String s1 = "2347ABGH";
        String s2 = "8763HJED35649";
        System.out.println(add(s1,s2));
    }
}
