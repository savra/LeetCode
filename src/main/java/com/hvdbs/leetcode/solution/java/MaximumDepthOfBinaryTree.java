package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Maximum Depth of Binary Tree",
        url = "https://leetcode.com/problems/maximum-depth-of-binary-tree/")
public class MaximumDepthOfBinaryTree {
    private int resLeft;
    private int resRight;

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

    public int maxDepth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left != null) {
            resLeft = 1 + maxDepth(root.left);
        }

        if (root.right != null) {
            resRight = 1 + maxDepth(root.right);
        }

        return Math.max(resLeft, resRight);
    }
}
