package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "N-ary Tree Preorder Traversal",
        url = "https://leetcode.com/problems/n-ary-tree-preorder-traversal")
public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();

        preorderHelper(root, res);

        return res;
    }

    private void preorderHelper(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);

        for (Node n : root.children) {
            preorderHelper(n, result);
        }
    }
}
