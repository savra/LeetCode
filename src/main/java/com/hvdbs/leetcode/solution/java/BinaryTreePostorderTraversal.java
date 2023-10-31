package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Binary Tree Postorder Traversal",
        url = "https://leetcode.com/problems/binary-tree-postorder-traversal")
public class BinaryTreePostorderTraversal {
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

    public List<Integer> postorderTraversal(TreeNode root) {
       /* Recursive
       List<Integer> result = new ArrayList<>();

        traverse(root, result);
        return result;*/

        /*Iterative*/
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> s = new ArrayDeque<>();
        TreeNode lastVisited = null;

        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.offerFirst(root);
                root = root.left;
            } else {
                TreeNode head = s.peekFirst();

                if (head.right != null && head.right != lastVisited) {
                    root = head.right;
                } else {
                    result.add(head.val);
                    lastVisited = s.pollFirst();
                }
            }
        }

        return result;
    }

    /*private void traverse(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        traverse(root.left, result);
        traverse(root.right, result);
        result.add(root.val);
    }*/
}
