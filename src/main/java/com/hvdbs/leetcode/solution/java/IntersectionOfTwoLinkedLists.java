package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Set;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Intersection of Two Linked Lists",
        url = "https://leetcode.com/problems/intersection-of-two-linked-lists"
)
public class IntersectionOfTwoLinkedLists {
    //My Time Complexity: O(M+N∗logM)
    //My Space complexity: O(M)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> res = new HashSet<>();

        for (ListNode curA = headA; curA != null; curA = curA.next) {
            res.add(curA);
        }

        for (ListNode curB = headB; curB != null; curB = curB.next) {
            if (res.contains(curB)) {
                return curB;
            }
        }

        return null;
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
