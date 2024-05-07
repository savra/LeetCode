package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;


@CodeInfo(difficulty = Difficulty.EASY,
        name = "Reverse Linked List",
        url = "https://leetcode.com/problems/reverse-linked-list",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
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

    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode prev = null;

        for (ListNode cur = head, next = null; cur != null; ) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
