package com.hvdbs.leetcode.solution.java;

public class InvertBinaryTree {
    static TreeNode current;

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        TreeNode newRoot = new TreeNode(root.val);
        current = newRoot;
        invertSubTree(root, current);

        return newRoot;
    }

    private static void invertSubTree(TreeNode root, TreeNode parent) {
        if (root == null) {
            return;
        }

        current.left = new TreeNode(root.right.val);
        current.right = new TreeNode(root.left.val);;

         if (root.left.left != null && root.right.right != null) {
             parent = current;
             current = current.left;
             invertSubTree(root.right, parent);
             current = parent.right;
             invertSubTree(root.left, parent);
         }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode treeNode = invertTree(root);
        System.out.println(treeNode.val);
    }
}
