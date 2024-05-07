package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CodeInfo(difficulty = Difficulty.MEDIUM,
        name = "Deepest Leaves Sum",
        url = "https://leetcode.com/problems/deepest-leaves-sum/")
public class DeepestLeavesSum {
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

    Map<Integer, List<Integer>> leaves = new HashMap<>();
    int maxHeight = 0;

    public int deepestLeavesSum(TreeNode root) {
        int height = 0;

        traverse(root, height);

        return leaves.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(maxHeight))
                .flatMapToInt(entry -> entry.getValue()
                        .stream()
                        .mapToInt(Integer::intValue)
                ).sum();
    }

    private void traverse(TreeNode root, Integer height) {
        if (root.left == null && root.right == null) {
            List<Integer> values = leaves.get(height);

            if (values != null) {
                values.add(root.val);
            } else {
                values = new ArrayList<>();
                values.add(root.val);
            }

            leaves.putIfAbsent(height, values);

            if (height > maxHeight) {
                maxHeight = height;
            }

            return;
        }

        if (root.left != null) {
            traverse(root.left, ++height);
            height--;
        }

        if (root.right != null) {
            traverse(root.right, ++height);
        }

        height--;
    }
}
