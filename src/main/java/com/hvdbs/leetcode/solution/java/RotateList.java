package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Rotate List",
        url = "https://leetcode.com/problems/rotate-list")
public class RotateList {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode cur = head;
        int n = 1;

        for (; cur.next != null; cur = cur.next) { n++; }
        cur.next = head;

        k = n - (k % n);

        while (k > 0) {
            cur = cur.next;
            k--;
        }

        head = cur.next;
        cur.next = null;

        return head;
    }
}
