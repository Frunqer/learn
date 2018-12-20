package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description: You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * @Date: Created in 下午3:38 2017/11/21
 * @Modified By:
 */
public class Solution4 {

    public static Node addTwoNode(Node node1,Node node2){
        if(null == node1){
            return node2;
        }
        if(null == node2){
            return node1;
        }
        Node p1= node1;
        Node p2= node2;
        //头节点
        Node root = new Node(0);
        Node r = root;
        //记录溢出
        int over = 0;
        int sum;
        while (null != p1 && null != p2){
            sum = (Integer) p1.value + (Integer) p2.value;
            sum = (sum+over) % 10;
            over = (sum+over) / 10;
            p1.value = sum;
            r.next = p1;
            r = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        if(null == p1){
            r.next = p2;
        } else {
            r.next = p1;
        }

        //当两个链表长度不一致时判断临界点
        while (null != r.next){
           sum = (Integer) r.next.value + over;
           r.next.value = sum % 10;
           over = sum / 10;
           r = r.next;
        }

        //当所有节点全部处理完毕,仍有进位时
        if(over > 0){
            r.next = new Node(over);
        }

        return root.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(6);
        Node n4 = new Node(7);
        Node n5 = new Node(8);
        Node n6 = new Node(3);
        Node n7 = new Node(4);
        Node n8 = new Node(8);

        Node node1 = n1;
        Node node2 = n6;

        node1.next =n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        node2.next = n7;
        n7.next = n8;

        Node result = addTwoNode(node1,node2);
        while (null != result.next){
            System.out.print(result.value.toString()+"-");
            result = result.next;
        }

    }
}
