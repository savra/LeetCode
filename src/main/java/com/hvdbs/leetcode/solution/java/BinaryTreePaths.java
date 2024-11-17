package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Binary Tree Paths",
        url = "https://leetcode.com/problems/binary-tree-paths",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class BinaryTreePaths {
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

    private static List<String> result = new ArrayList<>();

    public static List<String> binaryTreePaths(TreeNode root) {
        traverse(root, new StringBuilder());

        return result;
    }

    private static void traverse(TreeNode root, StringBuilder path) {
        if (root == null) {
            return;
        }

        int length = path.length();

        path.append(root.val);

        if (root.left == null && root.right == null) {
            result.add(path.toString());
        } else {
            path.append("->");

            if (root.left != null) {
                traverse(root.left, path);
            }

            if (root.right != null) {
                traverse(root.right, path);
            }
        }

        path.setLength(length);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        List<String> strings = binaryTreePaths(treeNode);

    }
}
