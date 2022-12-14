package com.noveo.model;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void print() {
        print(this);
    }

    private void print(TreeNode node) {
        if (node == null) {
            return;
        }

        print(node.left);
        System.out.printf("%s ", node.val);
        print(node.right);
    }
}
