package com.hvdbs.leetcode.solution.java;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode originalNode = traverseTree(original, target);

        return traverseTree(cloned, originalNode);
    }

    private static TreeNode traverseTree(TreeNode cloned, TreeNode target) {
        if (target.val == cloned.val) {
            return cloned;
        }

        if (cloned.left != null) {
            traverseTree(cloned.left, target);
        }

        if (cloned.right != null) {
            traverseTree(cloned.right, target);
        }

        return null;
    }

}
