package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Convert Binary Number in a Linked List to Integer",
        url = "https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/")
public class ConvertBinaryNumberInALinkedListToInteger {

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

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        if (head.next == null) {
            return head.val;
        }

        for (ListNode current = head; current != null; current = current.next) {
            sb.append(current.val);
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
