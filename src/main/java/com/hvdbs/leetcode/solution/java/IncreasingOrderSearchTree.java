package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Increasing Order Search Tree",
        url = "https://leetcode.com/problems/increasing-order-search-tree",
        spaceComplexity = Complexity.ConstantComplexity.LOGARITHMIC,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class IncreasingOrderSearchTree {
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

    TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode();
        current = newRoot;
        inOrderTraverse(root);

        return newRoot.right;
    }

    private void inOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraverse(root.left);
        current.right = new TreeNode(root.val);
        current = current.right;
        inOrderTraverse(root.right);
    }
}
