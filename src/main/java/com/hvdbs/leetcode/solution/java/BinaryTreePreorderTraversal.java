package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Binary Tree Preorder Traversal",
        url = "https://leetcode.com/problems/binary-tree-preorder-traversal"
)
public class BinaryTreePreorderTraversal {
    private List<Integer> result = new ArrayList<>();

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

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return result;
    }
}
