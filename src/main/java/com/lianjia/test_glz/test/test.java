package com.lianjia.test_glz.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:57 2018/1/24
 * @Modified By:
 */
public class test {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Collection c = new ArrayList();

    }


    public static long f(int n)//计算阶乘
    {
        long result = 1L;
        if(n==0)//规定0！=1
        {return 1;}
        else
        {
            for (int i = 1; i <= n; i++)
            {
                result = result*i; //计算n的阶乘

            }
            return result;
        }
    }

}
