package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Range Sum of BST",
        url = "https://leetcode.com/problems/range-sum-of-bst/")
public class RangeSumOfBST {

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

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int result = 0;

        if (root.val >= low && root.val <= high) {
            result += root.val;
        }

        return result + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.right.right = new TreeNode(18);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);

        int sumBST = rangeSumBST(treeNode, 7, 15);

        System.out.println(sumBST);
    }
}
