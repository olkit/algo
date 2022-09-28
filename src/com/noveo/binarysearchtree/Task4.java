package com.noveo.binarysearchtree;

import com.noveo.Task;
import com.noveo.model.TreeNode;

/**
 * @see <a href="https://www.geeksforgeeks.org/floor-and-ceil-from-a-bst/ ">Problem page</a>
 */
public class Task4 implements Task {

    public void run() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + ceil(root, i));
            System.out.println(i + " " + floor(root, i));
        }
    }


    //Node with the smallest data larger than or equal to the key value.
    public int ceil(TreeNode root, int key) {
        if(root == null) return -1;
        if(root.val == key) return root.val;

        if(root.val < key) {
            return ceil(root.right, key);
        }

        int result = ceil(root.left, key);
        return result >= key ? result: root.val;
    }

    //Node with the greatest data lesser than or equal to the key value.
    public int floor(TreeNode root, int key) {

        if(root == null) return -1;
        if(root.val == key) return root.val;

        if(root.val > key) {
            return floor(root.left, key);
        }

        int result = floor(root.right, key);
        return (result <= key && result != -1) ? result: root.val;

    }
}
