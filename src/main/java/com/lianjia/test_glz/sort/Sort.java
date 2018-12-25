package com.lianjia.test_glz.sort;

/**
 * @Author: guiliangzhou
 * @Description: 排序 https://www.cnblogs.com/onepixel/articles/7674659.html
 * @Date: Created in 下午 4:49 2018/12/25
 * @Modified By:
 */
public class Sort {

    /**
     * 冒泡排序 时间复杂度O(n2) 空间复杂度O(1)
     * @param arr
     * @return
     */
    public int[] bubbleSort(int [] arr) {
        if (null == arr || arr.length < 2) {
            return arr;
        }
        for (int i = 0,m = arr.length - 1;i < m;i++) {
            for (int j = 0,n = m - i;j < n;j++) {
               if (arr[j] < arr[j+1]) {
                   int tmp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = tmp;
               }
            }
        }
        return arr;
    }

    /**
     * 选择排序 时间复杂度O(n2) 空间复杂度O(1)
     * @param arr
     * @return
     */
    public int[] selectionSort(int[] arr) {
        if (null == arr || arr.length < 2) {
            return arr;
        }
        int minIndex,tmp;
        for (int i = 0,m = arr.length -1;i < m;i++) {
            minIndex = i;
            for (int j = i+1,n = arr.length;j < n;j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    /**
     * 插入排序 时间复杂度O(n2) 空间复杂度O(1)
     * @param arr
     * @return
     */
    public int[] insertSort(int[] arr) {
        if (null == arr || arr.length < 2) {
            return arr;
        }
        int preIndex,current;
        for (int i = 1,m = arr.length;i < m;i++) {
            preIndex = i - 1;
            current = i;
            while (preIndex >= 0 && arr[preIndex] > arr[current]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = arr[current];
        }
        return arr;
    }

}
