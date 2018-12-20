package com.lianjia.test_glz.jianzhioffer;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午4:15 2018/6/13
 * @Modified By:
 */
public class ArraySelect {

    public static int[][] select(int[][] a,int target) throws Exception {
        if(null == a || a.length == 0){
            throw new Exception("参数不合法");
        }
        int rows = a.length,row = 0;
        int cols = a[0].length,col = cols-1;

        while (a[row][col] != target){
            row++;
        }
        return null;
    }
}
