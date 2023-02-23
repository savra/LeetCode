package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInfo(difficulty = Difficulty.EASY, name = "N-ary Tree Preorder Traversal",
        url = "https://leetcode.com/problems/n-ary-tree-preorder-traversal")
public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root != null) {
            result.add(root.val);

            for(Node n : root.children) {
                preorder(n);
            }
        }

        return result;
    }
}
