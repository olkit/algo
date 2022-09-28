package com.noveo.binarysearchtree;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/range-sum-of-bst/">Problem page</a>
 */
public class Task5 implements Task {

    public void run() {
        TreeNode root =
                new TreeNode(15,
                        new TreeNode(9,
                            new TreeNode(7),
                            new TreeNode(13,
                                new TreeNode(5),
                                new TreeNode())),
                        new TreeNode(21,
                            new TreeNode(19),
                            new TreeNode(23,
                                new TreeNode(11),
                                new TreeNode()))
                );

        System.out.println(rangeSumBST(root, 19, 21));//expects 40
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        if (low <= root.val && root.val <= high)
            sum += root.val;

        if(low < root.val)
            sum += rangeSumBST(root.left, low, high);
        if(high > root.val)
            sum += rangeSumBST(root.right, low, high);
        return sum;
    }
}
