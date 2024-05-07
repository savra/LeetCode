package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Swap Nodes in Pairs",
        url = "https://leetcode.com/problems/swap-nodes-in-pairs")
public class SwapNodesInPairs {
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

    public static ListNode swapPairs(ListNode head) {
        ListNode newHeadNode = new ListNode(-1);
        newHeadNode.next = swap(head);

        return newHeadNode.next;
    }

    private static ListNode swap(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode cur = head.next;
        ListNode next = head.next.next;
        cur.next = head;
        head.next = swap(next);

        return cur;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l.next = l2;
        l2.next = l3;
        l3.next = l4;

        swapPairs(l);
    }
}
