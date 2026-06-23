package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Swap Nodes in Pairs",
        url = "https://leetcode.com/problems/swap-nodes-in-pairs",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
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

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforePair = dummy;

        while (beforePair.next != null && beforePair.next.next != null) {
            ListNode left = beforePair.next;
            ListNode right = left.next;

            left.next = right.next;
            right.next = left;
            beforePair.next = right;

            beforePair = left;
        }

        return dummy.next;
    }
}
