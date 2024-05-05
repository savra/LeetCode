package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Flatten a Multilevel Doubly Linked List",
        url = "https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list")
public class FlattenAMultilevelDoublyLinkedList {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node newList = head;
        Node next;
        Node child;
        Node childTail;

        while (newList != null) {
            next = newList.next;

            if (newList.child != null) {
                child = newList.child;

                Node cur = child;
                for (; cur.next != null; cur = cur.next) {
                }
                childTail = cur;

                newList.next = child;
                child.prev = newList;
                childTail.next = next;

                if (next != null) {
                    next.prev = childTail;
                }

                next = child;
                newList.child = null;
            }

            newList = next;
        }

        return head;
    }
}
