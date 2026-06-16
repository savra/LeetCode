package com.hvdbs.leetcode.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;


@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Intersection of Two Linked Lists",
        url = "https://leetcode.com/problems/intersection-of-two-linked-lists",
        timeComplexity = Complexity.ConstantComplexity.BILINEAR, // O (N + M)
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0;
        int bLength = 0;

        ListNode a = headA;
        ListNode b = headB;

        while(a != null) {
            a = a.next;
            aLength++;
        }

        while(b != null) {
            b = b.next;
            bLength++;
        }

        a = headA;
        b = headB;

        int i;

        if (aLength > bLength) {
            i = aLength - bLength;

            while (i > 0) {
                a = a.next;
                i--;
            }
        } else {
            i = bLength - aLength;

            while (i > 0) {
                b = b.next;
                i--;
            }
        }

        while (a != b) {
            a = a.next;
            b = b.next;
        }

        return a;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
