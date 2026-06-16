package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Palindrome Linked List",
        url = "https://leetcode.com/problems/palindrome-linked-list",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class PalindromeLinkedList {
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

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode startSecondHalf = fast == null ? slow : slow.next;

        ListNode reversed = null;

        while (startSecondHalf != null) {
            ListNode tmp = startSecondHalf.next;
            startSecondHalf.next = reversed;
            reversed = startSecondHalf;
            startSecondHalf = tmp;
        }

        while (reversed != null) {
            if (head.val != reversed.val) {
                return false;
            }

            head = head.next;
            reversed = reversed.next;
        }

        return true;
    }
}
