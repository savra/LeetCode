package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Minimum Depth of Binary Tree",
        url = "https://leetcode.com/problems/minimum-depth-of-binary-tree",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class MinimumDepthOfBinaryTree {
    public class TreeNode {
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

    private int minDepth = 0x7FFFFFFF;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        getMinimumDepth(root.left, 2);
        getMinimumDepth(root.right, 2);

        return minDepth;
    }

    private void getMinimumDepth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            minDepth = Math.min(minDepth, depth);
        }

        if (root.left != null || root.right != null) {
            depth++;

            if (depth > minDepth) {
                return;
            }

            if (root.left != null) {
                getMinimumDepth(root.left, depth);
            }

            if (root.right != null) {
                getMinimumDepth(root.right, depth);
            }
        }
    }
}
