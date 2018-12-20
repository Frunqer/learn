package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description:  老师组织小朋友们玩游戏，首先他让小朋友们围成一个大圈，然后他指定一个数m,让编号为0的小朋友开始报数。每次喊到
 * m-1的那个小朋友要出列唱首歌，然后可以在礼品箱中任意的挑选礼物，，并且不再回到圈中，从他的下一个小朋友开始，继续0，...m-1报数，
 * 这样下去，直到剩最后一个小朋友，可以不用表演。并且可以拿到一只，炒鸡可爱的"兔兔公仔",请问哪个小朋友能得到这个公仔呢?(小朋友的编号是0到n-1)
 * @Date: Created in 下午3:59 2018/1/26
 * @Modified By:
 */
public class Solution8 {

    public static Node header;

    //初始化链表
    public static void init(int n){
        header = new Node(0);
        Node p = header;
        for(int i = 1;i<n;i++){
            Node node = new Node(i);
            p.next = node;
            p = p.next;
        }
        p.next = header;

        Node q = header;
        while (q.next != p.next){
            q = q.next;
            System.out.println(q.value);
        }
    }

    public static int cycle(int m,int n){
        init(n);
        Node start = header;
        Node p1 =null;
        for(int remain =n;remain >1;remain--){
            for(int i = 0;i<m;i++){
               if(i == m-2){
                   p1 =start;
               }
               start = start.next;
            }
            p1.next = start;
        }
        return (int)start.value;
    }

    public static void main(String[] args) {
        System.out.println(cycle(3,5));
    }
}
