package com.noveo.depthfirstsearch;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/">Problem page</a>
 */
public class Task9 implements Task {
    @Override
    public void run() {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;
        if(root == p || root == q) return root;

        TreeNode leftRoot = lowestCommonAncestor(root.left, p, q);
        TreeNode rightRoot = lowestCommonAncestor(root.right, p, q);
        boolean hasLeft = leftRoot != null;
        boolean hasRight = rightRoot != null;


        if(hasLeft && hasRight) {
            return root;
        } else {
            if(hasLeft) return leftRoot;
            if(hasRight) return rightRoot;
        }
        return null;
    }
}
