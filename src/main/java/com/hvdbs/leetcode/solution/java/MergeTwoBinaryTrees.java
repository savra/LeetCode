package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Merge Two Binary Trees",
        url = "https://leetcode.com/problems/merge-two-binary-trees",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class MergeTwoBinaryTrees {
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

    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return null;
        }

        TreeNode newTreeRoot = new TreeNode(0x80000000);
        merge(r1, r2, newTreeRoot);
        deleteEmptyLeaf(newTreeRoot);

        return newTreeRoot;
    }

    private void merge(TreeNode r1, TreeNode r2, TreeNode newTreeRoot) {
        if (r1 == null && r2 == null) {
            return;
        }

        if (r1 != null && r2 != null) {
            newTreeRoot.val = r1.val + r2.val;
        } else if (r1 != null) {
            newTreeRoot.val = r1.val;
        } else {
            newTreeRoot.val = r2.val;
        }

        newTreeRoot.left = new TreeNode(0x80000000);
        merge(r1 != null ? r1.left : null, r2 != null ? r2.left : null, newTreeRoot.left);
        newTreeRoot.right = new TreeNode(0x80000000);
        merge(r1 != null ? r1.right : null, r2 != null ? r2.right : null, newTreeRoot.right);
    }

    private void deleteEmptyLeaf(TreeNode root) {
        if (root == null) {
            return;
        }

        deleteEmptyLeaf(root.left);
        deleteEmptyLeaf(root.right);

        if (root.left != null && root.left.val == 0x80000000) {
            root.left = null;
        }

        if (root.right != null && root.right.val == 0x80000000) {
            root.right = null;
        }
    }
}
