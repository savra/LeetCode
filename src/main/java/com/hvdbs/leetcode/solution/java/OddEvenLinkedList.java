package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Odd Even Linked List",
        url = "https://leetcode.com/problems/odd-even-linked-list",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
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
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode evenHead = head.next;
        ListNode currOdd = head;
        ListNode currEven = evenHead;

        while (currEven != null && currEven.next != null) {
            currOdd.next = currEven.next;
            currEven.next = currEven.next.next;

            currOdd = currOdd.next;
            currEven = currEven.next;
        }

        currOdd.next = evenHead;

        return head;
    }
}
