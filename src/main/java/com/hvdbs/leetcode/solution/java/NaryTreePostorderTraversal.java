package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "N-ary Tree Postorder Traversal",
        url = "https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/")
public class NaryTreePostorderTraversal {
    static class Node {
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
    };

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();

        postOrderHelper(root, res);

        return res;
    }

    private void postOrderHelper(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        for (Node n : root.children) {
            postOrderHelper(n, result);
        }

        result.add(root.val);
    }
}
