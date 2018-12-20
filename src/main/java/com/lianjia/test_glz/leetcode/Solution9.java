package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:56 2018/1/26
 * @Modified By:
 */
public class Solution9 {

    public static void main(String[] args) {
        System.out.println(cycle(3,5));
    }

    public static int cycle(int m ,int n){
        if(m<0 || n<0){
            return 0;
        }
        String str = init(n);
        int target = m-1;
        for(int remain = n;remain > 1;remain--){
            if(m < remain){
                str = turn(str,target);
            }else {
                if(m % n == 0){
                   target = n;
                }else {
                    target = m % n;
                }
                str = turn(str,target);
            }
        }
        return 0;
    }
    public static String init(int n){
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<n;i++){
            sb.append(i);
        }
        return sb.toString();
    }
    public static String turn(String sb,int target){
        if(sb.length() == 1){
            return sb;
        }
        int length = sb.length();
        if(target > length){
            return null;
        }
        if(target == length - 1){
            return sb.substring(0,length-1);
        }
        String str = sb.substring(target+1,length)+sb.subSequence(0,target);
        return str;
    }
}
