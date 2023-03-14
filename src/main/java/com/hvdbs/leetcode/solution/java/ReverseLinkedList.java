package com.hvdbs.leetcode.solution.java;

import java.util.*;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();

        if (head == null) {

        }

        while (head.next != null) {

        }

        return new ListNode();
    }
}
