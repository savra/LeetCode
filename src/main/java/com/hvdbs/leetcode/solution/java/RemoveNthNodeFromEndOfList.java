package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Remove Nth Node From End of List",
        url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class RemoveNthNodeFromEndOfList {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        ListNode l = dummy;
        ListNode r = dummy;

        while (n > 0) {
            r = r.next;
            n--;
        }

        while (r.next != null) {
            r = r.next;
            l = l.next;
        }

        l.next = l.next.next;

        return dummy.next;
    }
}
