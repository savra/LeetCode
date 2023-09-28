package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@LeetCodeInfo(
        difficulty = Difficulty.EASY,
        name = "Merge Two Sorted Lists",
        url = "https://leetcode.com/problems/merge-two-sorted-lists"
)
public class MergeTwoSortedLists {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head3 = new ListNode();

        ListNode cur = head3;

        while (true) {
            if (list1 == null) {
                cur.next = list2;
                break;
            }

            if (list2 == null) {
                cur.next = list1;
                break;
            }

            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        return head3.next;
    }
}
