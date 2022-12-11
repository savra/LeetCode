package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;
import com.sun.source.tree.Tree;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class MaximumDifferenceBetweenNodeAndAncestor {
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

    public static int maxAncestorDiff(TreeNode root) {
        int maxDiff = 0;
        String f = "f";
        char[] cc = f.toCharArray();
        java.util.Arrays.sort(cc);
        String ff = "ff";
        ff.equals(f);

        int[] maxMin = new int[]{root.val, root.val};
        int[] prevMaxMin = new int[]{root.val, root.val};

        int[] maxDifference = new int[] {0};

        traverseTree(root, maxMin, prevMaxMin, maxDifference, root.val);

        return maxDifference[0];
    }

    private static void traverseTree(TreeNode root, int[] maxMin, int[] prevMaxMin, int[] maxDifference, int rootValue) {
        if (root.left == null && root.right == null) {
            int maxDifference2 = Math.abs(maxMin[0] - maxMin[1]);
            maxDifference[0] = Math.max(maxDifference[0], Math.abs(maxMin[0] - maxMin[1]));
        }

        if (root.left != null) {
            prevMaxMin[0] = maxMin[0];
            prevMaxMin[1] = maxMin[1];
            maxMin[0] = Math.max(maxMin[0], root.left.val);
            maxMin[1] = Math.min(maxMin[1], root.left.val);
            traverseTree(root.left, maxMin, prevMaxMin, maxDifference, rootValue);
            maxMin = new int[]{prevMaxMin[0], prevMaxMin[1]};
        }

        if (root.right != null) {
            prevMaxMin[0] = maxMin[0];
            prevMaxMin[1] = maxMin[1];
            maxMin[0] = Math.max(maxMin[0], root.right.val);
            maxMin[1] = Math.min(maxMin[1], root.right.val);
            traverseTree(root.right, maxMin, prevMaxMin, maxDifference, rootValue);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);

        root2.right.right = new TreeNode(0);
        root2.right.right.left = new TreeNode(3);

        System.out.println(maxAncestorDiff(root));
    }
}
