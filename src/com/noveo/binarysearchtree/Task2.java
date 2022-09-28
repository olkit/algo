package com.noveo.binarysearchtree;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/invert-binary-tree">Problem page</a>
 */
public class Task2 implements Task {

    public void run() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        return isValidBST(root, left, right);
    }

    public boolean isValidBST(TreeNode root, int left, int right) {
        if (root == null) return true;
        if (root.val <= left || root.val >= right) return false;
        return isValidBST(root.left, left, root.val)
                && isValidBST(root.right, root.val, right);
    }
}
