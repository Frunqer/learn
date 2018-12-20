package com.lianjia.test_glz.leetcode;

/**
 * @Author: guiliangzhou
 * @Description: 单向链表
 * @Date: Created in 下午3:48 2017/11/21
 * @Modified By:
 */
public class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(Object value) {
        this.value = value;
    }
}
