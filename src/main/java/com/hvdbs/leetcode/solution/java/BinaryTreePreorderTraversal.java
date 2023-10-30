package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Binary Tree Preorder Traversal",
        url = "https://leetcode.com/problems/binary-tree-preorder-traversal"
)
public class BinaryTreePreorderTraversal {
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
        /*Recursive*/
       /* List<Integer> result = new ArrayList<>();
        traverse(root, result);

        return result;*/

        /*Iterative*/

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> s = new ArrayDeque<>();

        while (!s.isEmpty() || root != null) {
            if (!s.isEmpty()) {
                root = s.pollFirst();
            }

            while (root != null) {
                res.add(root.val);

                if (root.right != null) {
                    s.offerFirst(root.right);
                }

                root = root.left;
            }
        }

        return res;
    }

   /* private void traverse(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }*/
}
