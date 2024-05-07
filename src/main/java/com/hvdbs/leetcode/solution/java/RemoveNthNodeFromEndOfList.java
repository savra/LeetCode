package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Remove Nth Node From End of List",
        url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class RemoveNthNodeFromEndOfList {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            i++;
        }

        ListNode cur = head;
        ListNode prev = head;

        for (int j = 0; j < i; j++) {
            if (i - n == j) {
                if (cur == head) {
                    if (cur.next == null) {
                        return null;
                    } else {
                        head = cur.next;
                    }
                } else {
                    if (cur.next == null) {
                        prev.next = null;
                    } else {
                        prev.next = cur.next;
                    }
                }
            }

            prev = cur;
            cur = cur.next;
        }

        return head;
    }
}
