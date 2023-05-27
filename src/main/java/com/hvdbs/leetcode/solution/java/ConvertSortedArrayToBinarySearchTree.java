package com.hvdbs.leetcode.solution.java;

public class ConvertSortedArrayToBinarySearchTree {
    public static class TreeNode {
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

    public static TreeNode sortedArrayToBST(int[] nums) {
        int middleElement = nums[nums.length / 2];
        TreeNode root = new TreeNode(middleElement);

        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            insertIntoLeftSubTree(nums[i], root);
        }

        for (int i = nums.length / 2 + 1; i < nums.length; i++) {
            insertIntoRightSubTree(nums[i], root);
        }

        return root;
    }

    private static void insertIntoLeftSubTree(int elem, TreeNode root) {
        if (root.left == null) {
            root.left = new TreeNode(elem);
        } else {
            insertIntoLeftSubTree(elem, root.left);
        }
    }

    private static void insertIntoRightSubTree(int elem, TreeNode root) {
        if (root.right == null) {
            root.right = new TreeNode(elem);
        } else {
            insertIntoRightSubTree(elem, root.right);
        }
    }

    public static void main(String[] args) {
        sortedArrayToBST(new int[] {0, 1, 2, 3, 4, 5});
    }
}
