package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Find Mode in Binary Search Tree",
        url = "https://leetcode.com/problems/find-mode-in-binary-search-tree",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)

public class FindModeInBinarySearchTree {
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

    private int maxCount = 0;

    public int[] findMode(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new int[]{root.val};
        }

        Map<Integer, Integer> elemCount = new HashMap<>();

        traverse(root, elemCount);

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> elem : elemCount.entrySet()) {
            if (elem.getValue() == maxCount) {
                result.add(elem.getKey());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private void traverse(TreeNode root, Map<Integer, Integer> elemCount) {
        if (root == null) {
            return;
        }

        int currentCount = elemCount.getOrDefault(root.val, 0) + 1;
        maxCount = Math.max(currentCount, maxCount);
        elemCount.put(root.val, currentCount);

        traverse(root.left, elemCount);
        traverse(root.right, elemCount);
    }
}
