package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Binary Search Tree Iterator",
        url = "https://leetcode.com/problems/binary-search-tree-iterator")
public class BinarySearchTreeIterator {
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

    Queue<TreeNode> s = new ArrayDeque<>();

    public BinarySearchTreeIterator(TreeNode root) {
        offerTree(root);
    }

    public int next() {
        return s.poll().val;
    }

    public boolean hasNext() {
        return !s.isEmpty();
    }

    private void offerTree(TreeNode root) {
        if (root == null) {
            return;
        }

        offerTree(root.left);
        s.offer(root);
        offerTree(root.right);
    }
}
