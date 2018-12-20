package com.lianjia.test_glz.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: guiliangzhou
 * @Description: quicksort
 * @Date: Created in 下午12:03 2017/11/23
 * @Modified By:
 */
public class QuickSort {

    static int partition(int[] numbers,int left,int right){
        int i=left,j=right,key=numbers[i];
        while (i < j){

            while (i < j && key <= numbers[j]){
                j--;
            }
            while (i < j && key >= numbers[i]){
                i++;
            }

            if (i<j) {
                swap(numbers,i,j);
            }
        }
        if (i != j) {
            swap(numbers,i,j);
        }
        //swap(numbers,left,i);
        return j;
    }

    static void quickSort(int[] numbers,int left,int right){
        if(null == numbers || numbers.length == 0){
            return;
        }
        if (left < right) {
            int index = partition(numbers,left,right);
            quickSort(numbers,left,index - 1);
            quickSort(numbers,index + 1 ,right);
        }
    }

    static void swap(int[] numbers,int i,int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort2(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }


    static int partition1(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }

     static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }

    public static void quickSort2(int[] array, int left, int right) {
        if (left < right) {
            int pivot = array[left];
            int low = left;
            int high = right;
            while (low < high) {
                while (low < high && array[high] >= pivot) {
                    high--;
                }
                array[low] = array[high];
                while (low < high && array[low] <= pivot) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = pivot;
            quickSort2(array, left, low - 1);
            quickSort2(array, low + 1, right);
        }
    }



}
