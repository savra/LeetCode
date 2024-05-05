package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Odd Even Linked List",
        url = "https://leetcode.com/problems/odd-even-linked-list",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class OddEvenLinkedList {
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

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode even = head.next;
        ListNode odd = head;
        ListNode oddHead = odd;
        ListNode evenHead = even;

        while (true) {
            if (odd.next.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
            } else {
                break;
            }

            if (even.next.next != null) {
                even.next = even.next.next;
                even = even.next;
            } else {
                break;
            }
        }

        even.next = null;
        odd.next = evenHead;

        return oddHead;
    }
}
