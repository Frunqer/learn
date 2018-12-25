package com.lianjia.test_glz.data_structure;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: guiliangzhou
 * @Description: 链表节点
 * @Date: Created in 下午2:53 2018/12/25
 */
public class ListNode implements Serializable {

    public Integer value;
    public ListNode next;

    public ListNode(Integer value) {
        this.value = value;
    }

}
