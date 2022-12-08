package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "Leaf-Similar Trees", url = "https://leetcode.com/problems/leaf-similar-trees/description/")
public class LeafSimilarTrees {

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


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstTree = new ArrayList<>();
        List<Integer> secondTree = new ArrayList<>();

        traverseTree(root1, firstTree);
        traverseTree(root2, secondTree);

        if (firstTree.size() != secondTree.size()) {
            return false;
        }

        boolean leafSimilar = true;

        for (int i = 0; i < firstTree.size(); i++) {
            if (!Objects.equals(firstTree.get(i), secondTree.get(i))) {
                leafSimilar = false;
                break;
            }
        }

        return leafSimilar;
    }

    private void traverseTree(TreeNode root, List<Integer> result) {
        if (root.left == null & root.right == null) {
            result.add(root.val);
            return;
        }

        if (root.left != null) {
            traverseTree(root.left, result);
        }

        if (root.right != null) {
            traverseTree(root.right, result);
        }
    }
}
