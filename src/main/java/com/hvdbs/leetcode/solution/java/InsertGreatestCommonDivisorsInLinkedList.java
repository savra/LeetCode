package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Insert Greatest Common Divisors in Linked List",
        url = "https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class InsertGreatestCommonDivisorsInLinkedList {
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

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }

        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for (ListNode cur = head; cur.next != null; cur = cur.next.next) {
            ListNode newNode = new ListNode(gcdByEuclidsAlgorithm(cur.val, cur.next.val));
            newNode.next = cur.next;
            cur.next = newNode;
        }

        return head;
    }
}
