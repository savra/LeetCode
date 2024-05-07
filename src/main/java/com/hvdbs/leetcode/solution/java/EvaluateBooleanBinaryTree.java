package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Evaluate Boolean Binary Tree",
        url = "https://leetcode.com/problems/evaluate-boolean-binary-tree/solutions/")
public class EvaluateBooleanBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean evaluateTree(TreeNode root) {
        return traverseTree(root);
    }

    private boolean traverseTree(TreeNode root) {
        boolean result;

        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean right = traverseTree(root.right);
        boolean left = traverseTree(root.left);


        if (root.val == 3) {
            result = right && left;
        } else {
            result = right || left;
        }

        return result;
    }
}
