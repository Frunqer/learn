package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description: 给定一个链表，对每两个相邻的结点作交换并返回头节点。例如：给定 1->2->3->4，你应该返回 2->1->4->3。
 * 你的算法应该只使用额外的常数空间。不要修改列表中的值，只有节点本身可以​​更改。
 * @Date: Created in 下午3:11 2018/3/28
 * @Modified By:
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode stmp1 = head;
        ListNode stmp2 = head.next;
        ListNode pre = null;

        //head
        stmp1.next = stmp2.next;
        stmp2.next = stmp1;
        head = stmp2;

        stmp1 = head;
        stmp2 = head.next;
        pre = stmp2;


        while (pre.next.next != null) {
            stmp1.next = stmp2.next;
            stmp2.next = stmp1;
            pre.next = stmp2;

            pre = pre.next.next;
            stmp1 = pre.next;
            stmp2 = pre.next.next;
        }

        return head;
    }



    class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
}