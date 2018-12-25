package com.lianjia.test_glz.data_structure;

import org.apache.zookeeper.server.DataNode;

import java.util.List;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午3:07 2018/12/25
 */
public class ListNodeOperation {

    private ListNode head;

    public ListNodeOperation(Integer size) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i < size; i++) {
            ListNode tmp = new ListNode(i);
            cur.next = tmp;
            cur = tmp;
        }
        this.head = head;
    }

    public ListNode reverse(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode pre = null,next = null;
        return null;
    }
}
