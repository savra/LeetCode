package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Copy List with Random Pointer",
        url = "https://leetcode.com/problems/copy-list-with-random-pointer"
)
public class CopyListWithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();
        Node newHead = new Node(-1);

        for(Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }

        for(Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }

        return newHead.next;
    }
}
