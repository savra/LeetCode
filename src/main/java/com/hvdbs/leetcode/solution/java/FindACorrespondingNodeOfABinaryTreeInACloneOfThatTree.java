package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Find a Corresponding Node of a Binary Tree in a Clone of That Tree",
        url = "https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    private static TreeNode result;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        //depthFirstSearch(cloned, target);
        return breadthFirstSearch(cloned, target);
    }

    //TC: O(n), SC: O(n)
    private static void depthFirstSearch(TreeNode root, TreeNode target) {
        if (root == null) {
            return;
        }

        if (root.val == target.val) {
            result = root;
            return;
        }

        depthFirstSearch(root.left, target);
        depthFirstSearch(root.right, target);
    }

    //TC: O(n), SC: O(n)
    private static TreeNode breadthFirstSearch(TreeNode root, TreeNode target) {
        TreeNode result = null;

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val == target.val) {
                result = node;
                break;
            }

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode target = new TreeNode(3);

        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = target;
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = target;
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        getTargetCopy(original, cloned, target);
        //[7,4,3,null,null,6,19]
    }
}
