package com.lianjia.test_glz.leetcode;


import java.util.Arrays;

/**
 *Given an array of integers that is already sorted in ascending order,
 find two numbers such that they add up to a specific target number.
 The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2.
 Please note that your returned answers (both index1 and index2) are not zero-based.
 You may assume that each input would have exactly one solution.
 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 Tags: Array Two Pointers, Binary Search
 Similar Problems: (M) Two Sum
 */
public class Solution1 {
    private static int[]  numbers = {2,8,9,11,13,15};
    public static int[] twoSum(int[] numbers,int target){
        if(null == numbers || numbers.length < 2){
            return null;
        }
        int[] output = new int[2];
        int i = 0,j = numbers.length-1;
        boolean flag = false;
        while (i != j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else {
                flag = true;
                break;
            }
        }
        if(flag){
            output[0] = i+1;
            output[1] = j+1;
            return output;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(numbers,22)));
    }
}
