package com.lianjia.test_glz.leetcode;


/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 上午11:30 2018/1/26
 * @Modified By:
 */
public class Solution7 {

    public static void main(String[] args) {
        System.out.println(cicyle(2,3));
    }


    public static int cicyle(int m, int n) {
        if (m < 0 || n < 0) {
            return n;
        }
        int[] a = new int[n];
        //init code
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int remain = n;
        for (int i = 0; i < n; i++) {
            //hit subscript
            int target = m % remain;
            int[] out = turnArray(a,target);
            a = out;
            remain--;
            if(remain == 1){
               return out[0];
            }
        }

        return 0;
    }

    public static int[] turnArray(int[] a, int target) {
        int[] b = new int[a.length-1];
        if(target == a.length-1){
            for(int i = 0,n = a.length-1;i<n;i++){
                b[i] = a[i];
            }
            return b;
        }
        int j = 0;
        if(target < a.length -1){
            for (int i = target + 1, n = a.length; i < n; i++) {
                b[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < target; i++,j = j + 1) {
            b[j] = a[i];
        }
        return b;
    }
}
