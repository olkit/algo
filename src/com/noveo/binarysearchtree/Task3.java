package com.noveo.binarysearchtree;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ ">Problem page</a>
 */
public class Task3 implements Task {

    public void run() {
        sortedArrayToBST(new int[]{-10,-3,0,5,9}).print();
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return findRoot(nums, 0, nums.length-1);
    }

    public TreeNode findRoot(int[] nums, int left, int right) {
        if(left > right) return null;


        TreeNode treeNode = new TreeNode();
        int middle =  (right + left) / 2;
        treeNode.val = nums[middle];
        treeNode.left = findRoot(nums, left, middle - 1);
        treeNode.right = findRoot(nums, middle + 1, right);
        return treeNode;
    }
}
