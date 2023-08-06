package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(name = "Middle of the Linked List",
        difficulty = Difficulty.EASY,
        url = "https://leetcode.com/problems/middle-of-the-linked-list/description/")
public class MiddleOfTheLinkedList {
    public class ListNode {
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

    public ListNode middleNode(ListNode head) {
        ListNode[] tmp = new ListNode[100];

        int i = 0;

        while (head != null) {
            tmp[i++] = head;
            head = head.next;
        }

        return tmp[i / 2];
    }
}
