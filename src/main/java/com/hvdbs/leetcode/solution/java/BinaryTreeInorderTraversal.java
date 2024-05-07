package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Binary Tree Inorder Traversal",
        url = "https://leetcode.com/problems/binary-tree-inorder-traversal",
        timeComplexity = "O(N)",
        spaceComplexity = "O(H)"
)
public class BinaryTreeInorderTraversal {
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

   /* Iterative TC: O(N), SC: O(N)
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> s = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        while(root != null || !s.isEmpty()) {
            while(root != null) {
                s.offerFirst(root);
                root = root.left;
            }

            root = s.pollFirst();
            res.add(root.val);
            root = root.right;
        }

        return res;
    }*/

    //
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        inOrder(root, result);

        return result;
    }

    /* Recursive TC: O(N), SC: O(h) - h - tree height*/
    private static void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        inorderTraversal(root).forEach(System.out::println);
    }
}
