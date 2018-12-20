package com.lianjia.test_glz.leetcode;

import java.util.Arrays;

/**
 * @Author: guiliangzhou
 * @Description: Given an array of integers, find how many pairs in the array such that
 * their sum is bigger than a specific target number. Please return the number of pairs.
 * Example
 * umbers=[2, 7, 11, 15], target=24
 * return 1
 * @Date: Created in 下午8:26 2017/11/15
 * @Modified By:
 */
public class Solution2 {

   public static  int twosum(int[] numbers,int target){
      if(null == numbers || target < 0){
          return 0;
      }
       //sort
       Arrays.sort(numbers);
       int left = 0,right = numbers.length-1,count = 0;
       while (left < right){
           if (numbers[left] + numbers[right] > target) {
               count += (right - left);
               right--;
           } else {
               left++;
           }
       }

       return count;
   }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15,3,5,8,23,24,13};
        System.out.println(Solution2.twosum(numbers,50));
    }
}
