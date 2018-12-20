package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description:  给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @Date: Created in 下午3:35 2018/2/25
 * @Modified By:
 */
public class Solution11 {

    public static int[] produce(int[] a){
        int[] m = new int[a.length];
        int[] n = new int[a.length];
        int[] b = new int[a.length];
        if(a.length < 2){
            return a;
        }
        m[0] = a[0];
        m[1] = a[0]*a[1];
        n[a.length-1] = a[n.length-1];
        n[a.length-2] = a[n.length-1]*a[n.length-2];
        for(int i = 2;i < a.length;i++){
            m[i] = m[i-2]*a[i-1];
        }
        for(int i = a.length-3;i >= 0;i--){
            n[i] = n[i+1]*a[i+2];
        }
        for(int i = 0;i < a.length;i++){
            b[i] = m[i]*n[i];
        }
        return b;
    }


}
