package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Same Tree",
        url = "https://leetcode.com/problems/same-tree",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class SameTree {
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

    private boolean isSameTree = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p, q);

        return isSameTree;
    }

    private void traverse(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p == null && q != null
                    || p != null && q == null) {
                isSameTree = false;
                return;
            }

            return;
        }

        if (p.val != q.val) {
            isSameTree = false;
            return;
        }

        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);
    }
}
