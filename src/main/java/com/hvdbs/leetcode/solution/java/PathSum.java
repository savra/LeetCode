package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Path Sum",
        url = "https://leetcode.com/problems/path-sum",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class PathSum {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return sum(root, targetSum, 0);
    }

    private boolean sum(TreeNode root, int targetSum, int total) {
        total += root.val;

        boolean resultLeftTree;
        boolean resultRightTree;

        if (root.left != null) {
            resultLeftTree = sum(root.left, targetSum, total);

            if (resultLeftTree) {
                return true;
            }
        }

        if (root.right != null) {
            resultRightTree = sum(root.right, targetSum, total);

            if (resultRightTree) {
                return true;
            }
        }

        return root.left == null && root.right == null && total == targetSum;
    }
}
