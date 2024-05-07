package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Root Equals Sum of Children",
        url = "https://leetcode.com/problems/root-equals-sum-of-children/")
public class RootEqualsSumOfChildren {

   public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
