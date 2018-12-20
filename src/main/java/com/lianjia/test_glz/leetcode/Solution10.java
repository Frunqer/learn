package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description:
 * 兔兔今天心情特别好,因为她去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 她随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,她决定去买体育彩票,
 * 嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....兔兔不高兴了,她想了想,
 * 决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
 * “So Lucky!”。兔兔决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们兔兔的运气如何。
 * 为了方便起见,你可以认为大小王是0。
 * @Date: Created in 下午2:04 2018/1/29
 * @Modified By:
 */
public class Solution10 {
    public static void main(String[] args) {
        int[] a = {0,0,4,5,1};
        System.out.println(isContinuous(a));
    }

    public static boolean isContinuous(int[] numbers){
        if(null == numbers || numbers.length != 5){
            return false;
        }
        boolean flag = true;
        int max = 0;
        int min = 0;
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] == 0){
                continue;
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(min == 0 || min > numbers[i]){
                min = numbers[i];
            }
        }
        //判断是否重复
        byte[] b = new byte[max+1];
        for(int i=0;i<numbers.length;i++){
            b[numbers[i]]++;
            if(b[numbers[i]]>1){
                flag = false;
                break;
            }
        }
        if(max - min > 4){
            flag = false;
        }
        return flag;
    }
}
