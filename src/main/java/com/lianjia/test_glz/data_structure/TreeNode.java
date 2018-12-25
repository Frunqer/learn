package com.lianjia.test_glz.data_structure;

/**
 * @Author: guiliangzhou
 * @Description: 二叉树节点
 * @Date: Created in 下午4:21 2018/12/21
 */
public class TreeNode {

    public Integer value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public TreeNode() {
    }

    public TreeNode(Integer value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
