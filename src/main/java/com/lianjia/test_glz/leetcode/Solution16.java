package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午3:52 2018/9/3
 * @Modified By:
 */
public class Solution16 {

    public static void insert(int[] a,int k){
        int low = 0,high = a.length - 1;
        partion(a,k,low,high);
    }

    static void partion(int [] a,int k,int low,int high){
        int middle = (low + high)/2;
        if(a[middle] < k){
            low = middle;
            partion(a,k,low,high);
        }
        if(a[middle] > k){
           high = middle;
           partion(a,k,low,high);
        }
        if(a[middle] == k){
            for(int i = middle;i<a.length;i++){
                if(a[i] == k){
                    System.out.println(i);
                }
            }
            for(int j = middle;j>0;j--){
                if(a[j] == k){
                    System.out.println(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,5,5,6,7};
        insert(a,5);
    }
}
