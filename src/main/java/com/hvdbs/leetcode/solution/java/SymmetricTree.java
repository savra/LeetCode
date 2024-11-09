package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Symmetric Tree",
        url = "https://leetcode.com/problems/symmetric-tree",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEARITHMIC
)
public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return traverse(root.left, root.right);
    }

    private boolean traverse(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == rightRoot) {
            return true;
        }

        if (leftRoot == null || rightRoot == null) {
            return false;
        }

        if (leftRoot.val != rightRoot.val) {
            return false;
        }

        return traverse(leftRoot.left, rightRoot.right) && traverse(leftRoot.right, rightRoot.left);
    }
}
