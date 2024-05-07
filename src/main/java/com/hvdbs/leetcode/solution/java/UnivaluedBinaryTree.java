package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Univalued Binary Tree",
        url = "https://leetcode.com/problems/univalued-binary-tree/")
public class UnivaluedBinaryTree {
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

    public boolean isUnivalTree(TreeNode root) {
        return traverseTree(root, root.val);
    }

    private boolean traverseTree(TreeNode root, int targetValue) {
        if (root.val == targetValue) {
            boolean res = true;

            if (root.right != null) {
                res = traverseTree(root.right, targetValue);
            }

            if (root.left != null) {
                res &= traverseTree(root.left, targetValue);
            }

            return res;
        } else {
            return false;
        }
    }
}
