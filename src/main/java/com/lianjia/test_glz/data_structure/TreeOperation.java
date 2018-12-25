package com.lianjia.test_glz.data_structure;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:47 2018/12/21
 */
public class TreeOperation {

    private List<Integer> beforeOrderList;
    private List<Integer> middleOrderList;
    private List<Integer> afterOrderList;

    public TreeOperation() {
        beforeOrderList = Lists.newArrayList();
        middleOrderList = Lists.newArrayList();
        afterOrderList = Lists.newArrayList();

    }

    /**
     *  先序递归遍历二叉树
     */
    public void beforeOperation(TreeNode node) {
        if (null == node) {
            return;
        }
        beforeOrderList.add(node.value);
        if (null != node.left) {
            beforeOperation(node.left);
        }
        if (null != node.right) {
            beforeOperation(node.right);
        }
    }

    /**
     * 中序递归遍历二叉树
     * @param node
     */
    public void middleOperation(TreeNode node) {
        if (null != node.left) {
            middleOperation(node);
        }
        middleOrderList.add(node.value);
        if(null != node.right) {
            middleOperation(node.right);
        }
    }

    /**
     * 后序递归遍历二叉树
     * @param node
     */
    public void afterOperation(TreeNode node) {
        if (null != node.left) {
            afterOperation(node.left);
        }
        if (null != node.right) {
            afterOperation(node.right);
        }
        afterOrderList.add(node.value);
    }
}
