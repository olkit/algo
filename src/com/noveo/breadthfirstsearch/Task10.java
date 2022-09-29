package com.noveo.breadthfirstsearch;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-vertical-order-traversal/ ">Problem page</a>
 */
public class Task10 implements Task {

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
    }
}
